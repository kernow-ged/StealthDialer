package com.gdg.stealthdialer;
import android.app.Application;


public class CallApp extends Application {
 
	private Settings settings;
 
	@Override
	public void onCreate() {
		settings = new Settings(this);
 	}
 
	public Settings getSettings() {
		return settings;
	}
 
}