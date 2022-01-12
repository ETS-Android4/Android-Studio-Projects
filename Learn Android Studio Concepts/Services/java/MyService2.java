package com.example.fatservices;

import static android.content.ContentValues.TAG;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service {
    public MyService2() {
    }

    Binder1 binder1=new Binder1();
    int a=0;
    @Override
    public void onCreate() {
        Log.d(TAG,"onCreate: ");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"onDestroy: ");
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG,"onUnbind: ");
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d(TAG,"onRebind: ");
        super.onRebind(intent);
    }

    public  int count(){
        a++;
        return a;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        Log.d(TAG,"onBind: ");
        return binder1;
    }



    public class Binder1 extends Binder{
        public MyService2 getService(){
            return MyService2.this;
        }
    }
}