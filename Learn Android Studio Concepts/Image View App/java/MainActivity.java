package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    ImageView andro,cpp_img,pytho,java_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t1 =(TextView)findViewById(R.id.reg);

        andro= (ImageView) findViewById(R.id.andro);
        andro.setImageResource(R.drawable.android);

        cpp_img= (ImageView)findViewById(R.id.cpp_img);
        cpp_img.setImageResource(R.drawable.cpp);

        java_img = (ImageView)findViewById(R.id.java_img);
        java_img.setImageResource(R.drawable.java);

        pytho= (ImageView) findViewById(R.id.pytho);
        pytho.setImageResource(R.drawable.python);


    }
}


