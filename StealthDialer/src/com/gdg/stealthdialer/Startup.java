package com.gdg.stealthdialer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Startup extends Activity {

String number;
String localUser;
String localPassword;
String remoteUser;
boolean routeAll;
boolean started;
Button hu;

public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	CallApp app = (CallApp) getApplicationContext();
	Settings settings = app.getSettings();
	//localUser = settings.getUsername();
	//localPassword = settings.getPassword();
	remoteUser = settings.getContact();
	started = settings.getActive(); 
	setContentView(R.layout.startup);
	EditText e=new EditText(this); 
	//e=(EditText)findViewById(R.id.field_user); 
	//e.setText(localUser,TextView.BufferType.EDITABLE);
	//e=(EditText)findViewById(R.id.field_password); 
	//e.setText(localPassword,TextView.BufferType.EDITABLE);
	e=(EditText)findViewById(R.id.field_remote_user); 
	e.setText(remoteUser,TextView.BufferType.EDITABLE);
	hu = (Button) findViewById(R.id.start);
	if(started == true) hu.setText("stop");	
	hu.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			   if(started == true) hu.setText("stop");
			   else hu.setText("start");
			  // hu.invalidate();
			   toggleStartStop();
			}
		});
	}

private void toggleStartStop(){
	CallApp app = (CallApp) getApplicationContext();
	Settings settings = app.getSettings();
// commit all strings here too 
// we'll do some string checking later....
	//settings.setUsername(((EditText) findViewById(R.id.field_user)).getText().toString());
	//settings.setPassword(((EditText) findViewById(R.id.field_password)).getText().toString());
	settings.setContact(((EditText) findViewById(R.id.field_remote_user)).getText().toString());
	started = settings.getActive(); 
	hu = (Button) findViewById(R.id.start);
	Context context = getApplicationContext();
	if(started == true) {
		settings.setActive(false);
		Toast.makeText(context, "StealthDialer service halted ", Toast.LENGTH_LONG).show();	
		finish();
		return;
		}
		else {
		settings.setActive(true);
		Toast.makeText(context, "StealthDialer service started ", Toast.LENGTH_LONG).show();	
		finish();
		return;
		}
	}



}