package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView star,moon;
Button strt,rev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star= findViewById(R.id.starid);
        star.setImageResource(R.drawable.blackstar);
        moon= findViewById(R.id.moonid);
        moon.setImageResource(R.drawable.blackmoon);
        strt= findViewById(R.id.strtid);
        rev= findViewById(R.id.revid);

        strt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animinc= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_inc);
                Animation animdec= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_dec);
                star.startAnimation(animinc);
                moon.startAnimation(animdec);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                star.clearAnimation();
                moon.clearAnimation();
            }
        });

    }
}