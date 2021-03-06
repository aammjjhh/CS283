package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	// 1. right click -> "Source" -> "Override/Implement Methods" -> choose
	// <onFunction(s)> -> press "Ok"
	// 2. write Log.i("MainActivity","I'm in <onFunction name>");
	// 3. run
	// 4. type in "tag:MainActivity" to LogCat

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("MainActivity", "I'm in onCreate");
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("MainActivity", "I'm in onDestroy");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("MainActivity", "I'm in onPause");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("MainActivity", "I'm in onStart");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("MainActivity", "I'm in onStop");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("MainActivity", "I'm in onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("MainActivity", "I'm in onResume");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		Log.i("MainActivity", "I'm in onCreatOptionsMenu");
		return true;
	}
}