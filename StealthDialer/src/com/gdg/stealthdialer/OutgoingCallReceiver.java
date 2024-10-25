package com.gdg.stealthdialer;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneNumberUtils;
import android.util.Log;


public class OutgoingCallReceiver extends BroadcastReceiver {
	public final static String EXTRA_NUMBER = "com.gdg.stealthphone.NUMBER";
	private Context context;

	public void onReceive(Context aContext, Intent intent) {
	   	 context = aContext;
	   	 String action = intent.getAction();
	   	 String number = getResultData();
	    	 if (number == null) return;

	   	 // if (our settings say not running)  return;
	    	 CallApp app = (CallApp) context.getApplicationContext();
	    	 Settings settings = app.getSettings();
	    	 String changedNumber = settings.getContact();
	    	 
	    	 if(settings.getActive()==false) 
	    	 	{   		     		 
	    		 setResultData(number);
	    		 return;
	    	 	}

		if(PhoneNumberUtils.isEmergencyNumber(number)) 
			{			
			setResultData(number);
			return;
			}
		
		if(!Intent.ACTION_NEW_OUTGOING_CALL.equals(action)) 
			{
		   	Log.e("OutgoingReceiver.java", "not ACTION_NEW_OUTGOING_CALL");
		    	setResultData(number);
           	    	return;
			}
		
		// pass phone number on in bundle and start InCall with an intent
		// InCall will do all the rest
	   // Toast.makeText(context, "Call:  "+number+" - ABORTING CALL.", Toast.LENGTH_LONG).show();	
		setResultData(changedNumber);
		return;
		
}  // end onReceive



} 