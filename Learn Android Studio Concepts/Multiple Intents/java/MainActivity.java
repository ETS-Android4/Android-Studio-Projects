package com.example.multipleintents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText n1,n2,res;

    Button ac1,ac2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac1=findViewById(R.id.button2);
        ac2=findViewById(R.id.button3);

        ac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        ac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent1);

            }
        });
        b1=findViewById(R.id.button);
        n1=findViewById(R.id.editTextNumber);
        n2=findViewById(R.id.editTextNumber2);
        res=findViewById(R.id.editTextNumber3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("num1",n1.getText().toString());
                intent.putExtra("num2",n2.getText().toString());
//                PendingIntent
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            if(requestCode==1)
            {
                int a=data.getIntExtra("sum",0);
                res.setText(String.valueOf(a));
            }
        }
    }
}