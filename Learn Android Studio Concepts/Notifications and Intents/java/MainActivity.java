package com.example.cat2notificationandintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    NotificationCompat.Builder builder;
    NotificationManagerCompat manager;
    final int NOTIFICATION_ID=0;
    final  String channelid="Mily";
    Button b1;
    ToggleButton t1,t2,t3;
    Switch s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=
                    new NotificationChannel(channelid,"Charvi",NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager=
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder=new NotificationCompat.Builder(MainActivity.this,channelid);
                builder.setSmallIcon(R.drawable.ic_launcher_foreground);
                builder.setContentTitle("Class Notification");
                builder.setContentText("You have a class tomorrow");
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("message","hello welcome to the notification Demo");
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                Notification notification=builder.build();
                manager=NotificationManagerCompat.from(MainActivity.this);
                manager.notify(NOTIFICATION_ID,notification);
            }
        } );
    }
}
