package com.example.cat2fab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton f1,f2;
    ExtendedFloatingActionButton f3;
    ChipGroup cg;
//    Chip chip;
    int i=0;
    int val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=findViewById(R.id.floatingActionButton);
        f2=findViewById(R.id.floatingActionButton2);
        f3=findViewById(R.id.extended_fab);
        f2.setVisibility(View.INVISIBLE);
        f3.setVisibility(View.INVISIBLE);
        cg=findViewById(R.id.cg);
        f1.setOnClickListener(new View.OnClickListener() { 
            @Override
            public void onClick(View v) { 
                if (i == 1) {
                    Toast.makeText(getApplicationContext(),"Expand", Toast.LENGTH_LONG).show();
                    f2.setVisibility(View.VISIBLE);
                    f3.setVisibility(View.VISIBLE);
                    i = 0;
                } 
                else { 
                    f3.setVisibility(View.INVISIBLE);
                    f2.setVisibility(View.INVISIBLE);
                    i = 1;
                } 
            } 
        } );
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cg.removeAllViews();
            }

        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chip chip=new Chip(MainActivity.this);
                chip.setText("chip"+String.valueOf(val++));
//                chip.setChipIcon(getDrawable(R.drawable.chip_icon));
//                chip.setCheckedIcon(getDrawable(R.drawable.check));
//                chip.setCloseIcon(getDrawable(R.drawable.close));
                chip.setCheckable(true);
                cg.addView(chip);
            }
        });
    } 
} 
