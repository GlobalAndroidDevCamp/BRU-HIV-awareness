/**
 * 
 */
package net.lp.hivawareness.v4;

import net.lp.hivawareness.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * @author pjv
 *
 */
public class StartFragment extends Fragment {

	/**
	 * 
	 */
	public StartFragment() {
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.start, container, false);
        
		Button b = (Button) view.findViewById(R.id.button1);
		b.setOnClickListener((View.OnClickListener)getActivity());
		
		return view;
    }

	/* (non-Javadoc)
	 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

	}

}