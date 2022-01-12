package com.example.cat2datedialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {
    EditText t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editTextTextPersonName);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDateDialog myDateDialog=new MyDateDialog();
                myDateDialog.show(getSupportFragmentManager(),"date piker");
            }
        });
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute)  {
        String s=String.valueOf(hourOfDay)+":"+String.valueOf(minute);
        t1.setText(s);
    }
}