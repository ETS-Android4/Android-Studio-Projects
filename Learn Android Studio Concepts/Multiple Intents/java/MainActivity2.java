package com.example.multipleintents;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity2 extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        e1=findViewById(R.id.editTextNumber4);
//        e2=findViewById(R.id.editTextNumber5);

//        img1=findViewById(R.id.imageView);
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent1=new Intent(MainActivity2.this, MainActivity3.class);
//                startActivity(intent1);
//            }
//        });

        b1=findViewById(R.id.button2);
        Intent i=getIntent();
        e1.setText(i.getStringExtra("num1"));
        e2.setText(i.getStringExtra("num2"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity2.this,MainActivity.class);
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                intent1.putExtra("sum",a+b);
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}