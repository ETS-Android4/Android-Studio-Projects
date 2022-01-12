package com.example.armstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView res;
    int numberRecieved;
    Boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res=findViewById(R.id.textView);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();

        numberRecieved=(b.getInt("arm_num",0));


        int length = String.valueOf(numberRecieved).length();
        if(length==4){
            flag=true;
        }
        else{
            res.setText("Number is not 4 digit");
        }
        if(flag) {
            int number = numberRecieved, originalNumber, remainder, result = 0, n = 0;
            originalNumber = number;
            for (; originalNumber != 0; originalNumber /= 10, ++n) ;
            originalNumber = number;
            for (; originalNumber != 0; originalNumber /= 10) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, n);
            }
            if (result == number)
                res.setText((number + " is an Armstrong number."));
            else
                res.setText((number + " is not an Armstrong number."));
        }
    }
}