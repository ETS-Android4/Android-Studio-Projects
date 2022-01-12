package com.example.cat2listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1.findViewById(R.id.textView3);
        t2.findViewById(R.id.textView4);
        imageView.findViewById(R.id.imageView2);
        Intent i = getIntent() ;
        t1.setText(i.getStringExtra("name"));
        t2.setText(i.getStringExtra("desc"));
        imageView.setImageResource(i.getIntExtra("image",0));
//        MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.media);
//        mediaPlayer.start();
    }
}