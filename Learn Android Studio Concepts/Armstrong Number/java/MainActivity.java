package com.example.armstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText num;
Button check;
int armnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.Number);
        check=findViewById(R.id.button);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                armnum=Integer.parseInt(num.getText().toString());
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                Bundle b=new Bundle();
                b.putInt("arm_num",armnum); //int
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}