package com.example.musicapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast; public class M3 extends Service {

    MediaPlayer myPlayer;


    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {


        myPlayer = MediaPlayer.create(this,R.raw.jorsey);
//setting loop play to true
//this will make the ringtone continuously playing	myPlayer.setLooping(false); // Set looping
    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Service Started and Playing Music", Toast.LENGTH_LONG).show();
        myPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped and Music Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}
