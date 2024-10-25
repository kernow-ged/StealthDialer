package com.gdg.stealthdialer;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Settings {
 
	private static final String USERNAME_KEY = "username";
	private static final String PASSWORD_KEY = "password";
	private static final String CONTACT_KEY = "contact";
	private static final String ROUTE_ALL_KEY = "route_all";
	private static final String ACTIVE_KEY = "active";
/* 
we'll get to the audio dubbing bit later
*/
	private static final String USERNAME_DEFAULT = "";
	private static final String PASSWORD_DEFAULT = "";
	private static final String CONTACT_DEFAULT = "4444";
	private static final boolean ROUTE_ALL_DEFAULT = true;
	private static final boolean ACTIVE_DEFAULT = false;
/* 
we'll get to the audio dubbing bit later
*/

	private final SharedPreferences settings;
 
	public Settings (Context act) {
		 settings = act.getSharedPreferences("userprefs", Context.MODE_PRIVATE);
	}
 
	public void setUsername(String username) {
		Editor editor = settings.edit();
		editor.putString(USERNAME_KEY, username);
		editor.commit();
	}
 
	public String getUsername() {
		return settings.getString(USERNAME_KEY, USERNAME_DEFAULT);
	}
 
	public void setPassword(String password) {
		Editor editor = settings.edit();
		editor.putString(PASSWORD_KEY, password);
		editor.commit();
	}
 
	public String getPassword() {
		return settings.getString(PASSWORD_KEY, PASSWORD_DEFAULT);
	}
 

	public void setContact(String contact) {
		Editor editor = settings.edit();
		editor.putString(CONTACT_KEY, contact);
		editor.commit();
	}
 
	public String getContact() {
		return settings.getString(CONTACT_KEY, CONTACT_DEFAULT);
	}
 

  	public void setActive(boolean active) {
		Editor editor = settings.edit();
		editor.putBoolean(ACTIVE_KEY, active);
		editor.commit();
	}

	public boolean getActive() {
		return settings.getBoolean(ACTIVE_KEY, ACTIVE_DEFAULT);
	}

	public void setRouteAll(boolean ra) {
		Editor editor = settings.edit();
		editor.putBoolean(ROUTE_ALL_KEY, ra);
		editor.commit();
	}

	public boolean getRouteAll() {
		return settings.getBoolean(ROUTE_ALL_KEY, ROUTE_ALL_DEFAULT);
	}


      // Check if there are any stored settings.
        // can be used to automatically load the settings page
        // where necessary
	public boolean hasSettings() {
		// We just check if a username has been set
		return (!settings.getString(USERNAME_KEY, "").equals(""));
	}
 
}