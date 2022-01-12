package com.example.fatbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getAction(), Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals("android.intent.action.HEADSET_PLUG"))
            Toast.makeText(context, "headset Plugged in/out", Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals("android.intent.action.AIRPLANE_MODE"))
            Toast.makeText(context, "airplane mode is changed", Toast.LENGTH_SHORT).show();

    }
}
