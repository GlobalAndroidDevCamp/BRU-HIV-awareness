/**
 * 
 */
package net.lp.hivawareness;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author pjv
 *
 */
public class BottomFragment extends Fragment {

	/**
	 * 
	 */
	public BottomFragment() {
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.touch, container, false);
    }


}