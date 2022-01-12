package com.example.fillform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView welcome,progs,ratings;
EditText name,eid,phid;
ImageView avatar;
Button uplaod,submit;
RadioGroup radioGroup;
RadioButton female,male,other;
CheckBox c1,c2,c3,c4;
RadioButton rb;
RatingBar ratingBar;
String gender="";
boolean java,cpp,c_ash,python;
ArrayList<String> details =new ArrayList<>();
boolean[] skills = new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Successfully Launched", Toast.LENGTH_LONG).show();

        name=(EditText) findViewById(R.id.name);
        welcome=(TextView) findViewById(R.id.welcome);
        welcome.setText("Welcome!");

        avatar= (ImageView) findViewById(R.id.avatar);
        avatar.setImageResource(R.drawable.usericon);
        uplaod=(Button)findViewById(R.id.upload);

        eid=(EditText) findViewById(R.id.eid);
        phid=(EditText) findViewById(R.id.phid);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                rb=findViewById(checkedId);
                gender=rb.getText().toString();
            }
        });
        female=(RadioButton) findViewById(R.id.female);
        male=(RadioButton) findViewById(R.id.male);
        other=(RadioButton) findViewById(R.id.other);

        progs=(TextView) findViewById(R.id.progs);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        c4=(CheckBox)findViewById(R.id.c4);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                java = isChecked;
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                cpp= isChecked;
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                python= isChecked;
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                c_ash= isChecked;
            }
        });

        ratings=(TextView) findViewById(R.id.ratings);
        ratingBar=(RatingBar) findViewById((R.id.ratingBar));

        submit=(Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Form Submitted Successfully for "+
                        name.getText().toString()+" !", Toast.LENGTH_SHORT).show();
                details.add(name.getText().toString());
                details.add(eid.getText().toString());
                details.add(phid.getText().toString());
                details.add(gender);
                skills[0]=java;
                skills[1]=cpp;
                skills[2]=python;
                skills[3]=c_ash;

            }
        });
    }
//    public void radioButtonhandler(View view) {
//
//        // Decide what happens when a user clicks on a button
//        if(male.isChecked()){gender="M";}
//        else if(female.isChecked()){gender="F";}
//        else if(other.isChecked()){gender="O";}
//        else {gender="-";}
//    }
}