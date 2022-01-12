package com.example.eventlistners;

import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText num1,num2,res;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.n1);
        num2=findViewById(R.id.n2);
        res=findViewById(R.id.result);
        add=findViewById(R.id.ba);
        sub=findViewById(R.id.bs);
        mul=findViewById(R.id.bm);
        div=findViewById(R.id.bd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a+b;
                res.setText(String.valueOf(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a-b;
                res.setText(String.valueOf(c));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a*b;
                res.setText(String.valueOf(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                int c=a/b;
                res.setText(String.valueOf(c));
            }
        });
    }
}