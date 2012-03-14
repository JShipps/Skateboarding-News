package com.appfondue.skateboardingnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread splashThread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					// do nothing
				} finally {
					finish();
					startActivity(new Intent(SplashScreen.this, SkateboardingNews.class));
					//stop();
				}
			}
		};
		splashThread.start();
	}
}
