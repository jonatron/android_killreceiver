package me.jonatron.killreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("me.jonatron.android.KILLER")) {
			android.os.Process.killProcess(android.os.Process.myPid());
		}
	}

}
