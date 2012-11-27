package com.example.aide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView coucou = null;
    		
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		coucou = new TextView(this);
		coucou.setText("Bonjour");
		setContentView(coucou);
	}

}
