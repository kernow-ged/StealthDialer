**Instructions**

Basically, this is a very simple app.
The StealthDialer app just has
- a field to enter your confederate's phone no.
- a button to start/stop the interception

Once this button is pressed, a message will flash up to that effect, and the app will exit. You can now work with your phone's regular dialer.

From now on, all phone numbers dialed (except emergency numbers) will be changed to your confederate's phone number. To switch the service off, and resume normal phone functionality, navigate to the StealthDialer app again and simply press Stop (same button, text will have changed to "stop").

If you left the service running and powered off the phone, it will still be running on reboot, and you will have to navigate to the StealthDialer app and turn the service off via the setup screen. Alternatively, in the unlikely event that you have trouble with the app, go to your phone's settings, and find StealthDialer under Applications, and click "Clear Data" button to reset everything.


**Caveat** 

This is still an experimental 'alpha version' from many years ago. It's a very simple app though, so if it works for you, it should work straightforwardly and reliably.

The outgoing (force) number is displayed under the name of the contact, rather than the dialed number.
It requires a certain amount of boldness to work with because of that 'tell'.

This is something that cannot be got round in a conventional way with Android.
to quote from:
~~http://www.meetup.com/blrdroid/messages/boards/thread/23899582#76003792~~ (dead link)

_Unfortunately the dialing/call screens are baked into the roms. You can think of it as a security feature._

I did have some other ideas to get round this in an entirely different way, which would incidentally come with some new features and effects, but haven't had the time to implement them; it would be a big project.

Well, if you don't mind the number-discrepancy, this is the simplest version of the app I have been investigating, one that simply redirects numbers.

It will ask for permission to 'intercept outgoing calls, read phone state...' which it needs to do its job.