package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.img1);
        Toast.makeText(getApplicationContext(), "in create", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in start", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in restart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in Pause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in Resume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        img1.setImageResource(R.drawable.usericon);
        Toast.makeText(getApplicationContext(), "in Destroy", Toast.LENGTH_SHORT).show();
    }
}
