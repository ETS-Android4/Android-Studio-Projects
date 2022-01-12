package com.example.cat2datepicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datepick);
        e1=findViewById(R.id.editTextTextPersonName);
        b1=findViewById(R.id.button);
        /*
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dp.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    String s=String.valueOf(dayOfMonth)+"/"+String.valueOf(monthOfYear+1)+"/"+String.valueOf(year);
                    e1.setText(s);
                }
            });
        }
        */
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day=dp.getDayOfMonth();
                int month=dp.getMonth()+1;
                int year=dp.getYear();
                String s=String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
                e1.setText(s);
            }
        });

    }
}
/*
public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp=findViewById(R.id.timepicker1);
        b1=findViewById(R.id.button);
        e1=findViewById(R.id.time);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int hrs=tp.getCurrentHour();
                 int min=tp.getCurrentMinute();
                 tp.setIs24HourView(Boolean.TRUE);
                 String s=String.valueOf(hrs)+":"+String.valueOf(min);
                 e1.setText(s);
            }
        });
    }
}
 */