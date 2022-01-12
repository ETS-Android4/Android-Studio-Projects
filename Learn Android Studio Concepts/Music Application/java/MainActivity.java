package com.example.musicapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Red = findViewById(R.id.button);
        Button Blue = findViewById(R.id.button2);
        Button Green = findViewById(R.id.button3);
        Button Yellow = findViewById(R.id.button4);
        Button Stop = findViewById(R.id.button5);
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }

                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));


                }

                startService(new Intent(MainActivity.this, M1.class));
            }
        });


        startService(new Intent(MainActivity.this,M1.class));

        Green.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            if (isMyServiceRunning(M1.class)){
                stopService(new Intent(MainActivity.this,M1.class));
            }
            if (isMyServiceRunning(M4.class)){
                stopService(new Intent(MainActivity.this,M4.class));
            }
            if (isMyServiceRunning(M3.class)) {
                stopService(new Intent(MainActivity.this, M3.class));

            }
            startService(new Intent(MainActivity.this, M2.class));

        }
        });
        startService(new Intent(MainActivity.this, M2.class));

        Blue.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            if (isMyServiceRunning(M2.class)){
                stopService(new Intent(MainActivity.this,M2.class));
            }
            if (isMyServiceRunning(M4.class)){
                stopService(new Intent(MainActivity.this,M4.class));

            }
            if (isMyServiceRunning(M1.class)) {
                stopService(new Intent(MainActivity.this, M1.class));

            }


            startService(new Intent(MainActivity.this, M3.class));

        }
        });


        startService(new Intent(MainActivity.this, M3.class));

        Yellow.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            if (isMyServiceRunning(M1.class)){
                stopService(new Intent(MainActivity.this,M1.class));
            }
            if (isMyServiceRunning(M2.class)){
                stopService(new Intent(MainActivity.this,M3.class));
            }
            if (isMyServiceRunning(M3.class)){
                stopService(new Intent(MainActivity.this,M3.class));
            }
            startService(new Intent(MainActivity.this, M4.class));
        }  });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isMyServiceRunning(M1.class) || isMyServiceRunning(M2.class)
                    || isMyServiceRunning(M3.class) || isMyServiceRunning(M4.class)
                ) {
                    stopService(new Intent(MainActivity.this, M1.class));
                    stopService(new Intent(MainActivity.this, M3.class));
                    stopService(new Intent(MainActivity.this, M3.class));
                    stopService(new Intent(MainActivity.this, M4.class));
                    Toast.makeText(getApplicationContext(), "Stopped All", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager)
            getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) { return true;
            }
        }
        return false;
    }}

