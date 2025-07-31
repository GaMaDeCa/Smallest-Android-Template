package Smallest.Android;

import android.app.*;
import android.os.*;
import android.widget.*;

public class Template extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(new LinearLayout(this));
    }
}
