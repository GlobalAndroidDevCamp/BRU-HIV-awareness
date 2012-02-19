package net.lp.hivawareness.v4;

import java.nio.charset.Charset;

import net.lp.hivawareness.R;
import net.lp.hivawareness.domain.Gender;
import net.lp.hivawareness.domain.Probability;
import net.lp.hivawareness.domain.Region;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.tech.NfcF;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class HIVAwarenessActivity extends FragmentActivity implements
		OnClickListener {
	private static final String PREFS_GENDER = "gender";
	private static final String PREFS_REGION = "region";
	private static final String PREFS_INFECTED = "infected";
	private static final String PREFS_HISTORY = "history";
	private static final String PREFS_HISTORY_INFECTED = "history_infected";
	
	private NfcAdapter mNfcAdapter;
	private int caught = 0;
	private boolean ran = false;
	private IntentFilter[] mIntentFiltersArray;
	private String[][] mTechListsArray;
	private PendingIntent mPendingIntent;
	public Gender mGender;
	public Region mRegion;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);

		// initialize values
		SharedPreferences prefs = PreferenceManager
				.getDefaultSharedPreferences(this);
		mGender = Gender.valueOf(prefs.getString(PREFS_GENDER, "male"));

		String region = prefs.getString(PREFS_REGION, null);
		if (region == null) {
			mRegion = null;
		}
		caught = prefs.getInt(PREFS_INFECTED, -1);
		
		if (caught == -1){
			calculateInitial(mRegion == null);
		}
		

		// Check for available NFC Adapter
		mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
		if (mNfcAdapter == null) {
			Toast.makeText(this, "NFC is not available", Toast.LENGTH_LONG)
					.show();
		}
		mPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this,
				getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);

		IntentFilter ndef = new IntentFilter(NfcAdapter.ACTION_NDEF_DISCOVERED);
		try {
			ndef.addDataType("application/net.lp.hivawareness.beam");
		} catch (MalformedMimeTypeException e) {
			throw new RuntimeException("fail", e);
		}
		mIntentFiltersArray = new IntentFilter[] { ndef };
		mTechListsArray = new String[][] { new String[] { NfcF.class.getName() } };

	}

	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			int genderPos = ((Spinner) findViewById(R.id.spinner_gender))
					.getSelectedItemPosition();
			

			mNfcAdapter.disableForegroundNdefPush(this);
			mNfcAdapter.enableForegroundNdefPush(this, createNdefMessage());

			FragmentManager fragmentManager = getSupportFragmentManager();
			FragmentTransaction transaction = fragmentManager
					.beginTransaction();

			StartedFragment sf = new StartedFragment();
			// Replace whatever is in the fragment_container view with this
			// fragment,
			// and add the transaction to the back stack
			transaction.remove(fragmentManager
					.findFragmentById(R.id.start_fragment));
			transaction.add(R.id.fragment_container, sf);
			transaction
					.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
			transaction.addToBackStack("started");

			// Commit the transaction
			transaction.commit();

			// use new values
			mGender = Gender.values()[genderPos];

			int regionPos = ((Spinner) findViewById(R.id.spinner_region))
					.getSelectedItemPosition();
			mRegion = Region.values()[regionPos];
			
			calculateInitial(false);
			
			// output values
			TextView tv = ((TextView) findViewById(R.id.debug));
			if (tv != null) {
				tv.setText("caught=" + caught + ", Gender="
						+ mGender.toString() + ", Region=" + mRegion.toString());
			}
			
			finishGame(caught == 1, 1);
			
		} else if (v.getId() == R.id.startover_button) {
			FragmentManager fragmentManager = getSupportFragmentManager();
			fragmentManager.popBackStack();

			// reset values
			mGender = Gender.male;
			mRegion = null;

			calculateInitial(true);

			// output values
			TextView tv = ((TextView) findViewById(R.id.debug));
			if (tv != null) {
				tv.setText("caught=" + caught + ", Gender="
						+ mGender.toString() + ", Region=" + mRegion);
			}
		}
	}

	private void storePreferences() {
		SharedPreferences prefs = PreferenceManager
				.getDefaultSharedPreferences(this);
		Editor editor = prefs.edit();
		editor.putString(PREFS_GENDER, mGender.name());
		
		if (mRegion != null){
			editor.putString(PREFS_REGION, mRegion.name());
		} else {
			editor.putString(PREFS_REGION, null);
		}
		
		editor.putInt(PREFS_INFECTED, caught);
		editor.commit();

	}

	/**
	 * 
	 */
	protected void calculateInitial(boolean worldCitizen) {
		if (!ran) {
			double prob;
			if (worldCitizen) {
				prob = Probability.worldwide * Probability.scale;
			} else {
				prob = Probability.fromData(mGender, mRegion)
						* Probability.scale;
			}
			caught = (int) Math.floor(Math.random() + Math.min(1, prob));
		}
		storePreferences();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	public NdefMessage createNdefMessage() {
		String text = "" + caught + "|" + mGender.name();
		NdefMessage msg = new NdefMessage(new NdefRecord[] { createMimeRecord(
				"application/net.lp.hivawareness.beam", text.getBytes())
		/**
		 * The Android Application Record (AAR) is commented out. When a device
		 * receives a push with an AAR in it, the application specified in the
		 * AAR is guaranteed to run. The AAR overrides the tag dispatch system.
		 * You can add it back in to guarantee that this activity starts when
		 * receiving a beamed message. For now, this code uses the tag dispatch
		 * system.
		 */
		// ,NdefRecord.createApplicationRecord("net.lp.hivawareness")
				});
		return msg;
	}

	@Override
	public void onResume() {
		super.onResume();
		// Check to see that the Activity started due to an Android Beam
		if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
			processIntent(getIntent());
		}
		mNfcAdapter.enableForegroundNdefPush(this, createNdefMessage());
		mNfcAdapter.enableForegroundDispatch(this, mPendingIntent,
				mIntentFiltersArray, mTechListsArray);
		
		NotificationManager nm = (NotificationManager) this
				.getSystemService(Context.NOTIFICATION_SERVICE);
		nm.cancel(1);
	}

	@Override
	protected void onPause() {
		super.onPause();
		if (mNfcAdapter != null) {
			mNfcAdapter.disableForegroundNdefPush(this);
			mNfcAdapter.disableForegroundDispatch(this);
		}

	}

	@Override
	public void onNewIntent(Intent intent) {
		// onResume gets called after this to handle the intent
		setIntent(intent);
		processIntent(intent);
	}

	/**
	 * Parses the NDEF Message from the intent and prints to the TextView
	 */
	void processIntent(Intent intent) {
		Parcelable[] rawMsgs = intent
				.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);
		// only one message sent during the beam
		NdefMessage msg = (NdefMessage) rawMsgs[0];

		String data = new String(msg.getRecords()[0].getPayload());
		String[] parts = data.split("\\|");

		// record 0 contains the MIME type, record 1 is the AAR, if present
		Log.v("HIV", "old status " + caught);

		double partnerInfected = Double.parseDouble(parts[0]);
		Gender partnerGender = Gender.valueOf(parts[1]);
		updateInfectionStatus(partnerInfected, partnerGender);

		Log.v("HIV", "new status " + caught);

	}

	private void updateInfectionStatus(double partnerInfected, Gender gender) {
		int caughtOld = caught;
		
		if (caught == 0d && partnerInfected > 0) {

			double factor;

			if (mGender == Gender.male) {

				if (gender == Gender.male) {
					factor = Probability.male_male; // male not infected - male
													// infected
				} else {
					factor = Probability.male_female; // male not infected -
														// female infected
				}
			} else {
				if (gender == Gender.male) {
					factor = Probability.female_male; // female not infected -
														// male infected
				} else {
					factor = Probability.female_female; // female not infected -
														// female infected
				}
			}

			double random = Math.random();
			caught = (int) Math.floor(random + (factor * Probability.scale));
			
			storePreferences();
			
			// output values
			TextView tv = ((TextView) findViewById(R.id.debug));
			if (tv != null) {
				tv.setText("caught=" + caught + ", Gender="
						+ mGender.toString() + ", Region=" + mRegion.toString());
			}

		}
		
		// store history
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		Editor editor = prefs.edit();
		int history = prefs.getInt(PREFS_HISTORY, 0);		
		history++;
		editor.putInt(PREFS_HISTORY, history);
		
		if (caughtOld == 0 && caught == 1 ){
			// remember when you were infected
			int historyInfected = history;
			editor.putInt(PREFS_HISTORY_INFECTED, historyInfected);			
		}
		editor.commit();
		
		// game over after 10 touches
		if (history  > 1){			
			finishGame(caught == 1, prefs.getInt(PREFS_HISTORY_INFECTED, 0));
		}
		
		
	}

	private void finishGame(boolean infected, int whenInfected) {
		
		
		String msg;
		if (infected && whenInfected == 0){
			msg = getString(R.string.infected_at_beginning);
		} else if (infected) {
			msg = getString(R.string.infected_when, whenInfected);
		} else {
			msg = getString(R.string.not_infected);
		}
		
		Intent intent = new Intent(this, AlertReceiver.class);
		intent.putExtra("message",msg);
		PendingIntent operation = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

		AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);		
		am.set(AlarmManager.RTC, System.currentTimeMillis(), operation);
	}

	/**
	 * Creates a custom MIME type encapsulated in an NDEF record
	 */
	public NdefRecord createMimeRecord(String mimeType, byte[] payload) {
		byte[] mimeBytes = mimeType.getBytes(Charset.forName("US-ASCII"));
		NdefRecord mimeRecord = new NdefRecord(NdefRecord.TNF_MIME_MEDIA,
				mimeBytes, new byte[0], payload);
		return mimeRecord;
	}

}