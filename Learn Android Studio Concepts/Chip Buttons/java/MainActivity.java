package com.example.cat2chipbuttons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    ChipGroup cg;
    Chip chip;
    Button b1,b2,b3;
    int val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cg=findViewById(R.id.chipgp);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Integer> a =cg.getCheckedChipIds();
                for(int i=0;i<a.size();i++)
                {
                    chip=findViewById(a.get(i));
                    if(chip.isChecked()) {
                        Toast.makeText(getApplicationContext(), chip.getText(), Toast.LENGTH_LONG).show();
                        chip.setOnCloseIconClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                cg.removeView(chip);
                            }
                        });
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chip chip=new Chip(MainActivity.this);
                chip.setText("chip"+String.valueOf(val++));
                chip.setChipIcon(getDrawable(R.drawable.chip_icon));
                chip.setCheckedIcon(getDrawable(R.drawable.check));
                chip.setCloseIcon(getDrawable(R.drawable.close));
                chip.setCheckable(true);
                cg.addView(chip);
            }
        });
    }
}