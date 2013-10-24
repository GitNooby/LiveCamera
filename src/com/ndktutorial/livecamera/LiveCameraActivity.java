package com.ndktutorial.livecamera;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LiveCameraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_live_camera);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.live_camera, menu);
		return true;
	}

}
