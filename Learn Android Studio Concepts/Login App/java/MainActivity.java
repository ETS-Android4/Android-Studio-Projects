package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fn,sn;
    Button b1,b2;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn=findViewById(R.id.fname);
        sn=findViewById(R.id.sname);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fn.getText().toString().equals("charvi") & sn.getText().toString().equals("vit"))
                {
                    Toast.makeText(getApplicationContext(),"login successful", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"login unsuccessful", Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn.setText(" ");
                sn.setText(" ");
            }
        });

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        fn.setText(name);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        name=fn.getText().toString();

    }
}