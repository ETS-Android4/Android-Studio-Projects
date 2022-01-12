package com.example.fatservices;
import static android.content.ContentValues.TAG;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    MyService2 myService2;
    @Override

    // This is for unbind and bind services:
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button3);
        b2=findViewById(R.id.button4);
        b3=findViewById(R.id.button5);
        ServiceConnection serviceConnection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                MyService2.Binder1 binder1=(MyService2.Binder1) iBinder;
                myService2=binder1.getService();


            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {

            }
        };
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyService2.class);
                bindService(intent, serviceConnection, Service.BIND_AUTO_CREATE);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unbindService(serviceConnection );
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c=myService2.count();
                Log.d(TAG,"onClick: "+String.valueOf(c));
            }
        });

    }
}

/*******************************************************************/
//Uncomment below to start a simple service:
//public class MainActivity extends AppCompatActivity {
//    Button b1,b2;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1=findViewById(R.id.button);
//        b2=findViewById(R.id.button2);
//        Intent intent = new Intent(MainActivity.this, MyService.class);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startService(intent);
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                stopService(intent);
//            }
//        });
//    }
//}