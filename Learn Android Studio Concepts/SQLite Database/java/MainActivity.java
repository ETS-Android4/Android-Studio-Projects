package com.example.fatsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText id, uname, univ;
Button binsert,bdisplay,bupdate,bdelete;
DataBaseConnect dbc;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = findViewById(R.id.id);
        uname = findViewById(R.id.uname);
        univ = findViewById(R.id.univ);
        binsert = findViewById(R.id.button);
        bdisplay = findViewById(R.id.button2);
        bupdate = findViewById(R.id.button3);
        bdelete = findViewById(R.id.button4);
        t1 = findViewById(R.id.textView);

        binsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean r=dbc.insertt(id.getText().toString(),uname.getText().toString(),univ.getText().toString());
                if(r==true)
                {
                    Toast.makeText(getApplicationContext(),"data inserted", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"data not inserted", Toast.LENGTH_LONG).show();
            }
        });
        bdisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor=dbc.display();
                if(cursor.getCount()==0)
                    Toast.makeText(getApplicationContext(),"data not retrieved", Toast.LENGTH_LONG).show();
                else
                {
                    StringBuilder sb=new StringBuilder();
                    while(cursor.moveToNext())
                    {
                        sb.append("Student id:"+cursor.getString(0)+"\t");
                        sb.append("Student name:"+cursor.getString(1)+"\t");
                        sb.append("University:"+cursor.getString(2)+"\n");

                    }
                    t1.setText(sb.toString());

                }
            }
        });

        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=id.getText().toString();
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
                boolean re=dbc.deletee(s1);
                if(re==true)
                    Toast.makeText(getApplicationContext(),"data delete", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"data not deleted", Toast.LENGTH_LONG).show();

            }
        });
        bupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean r=dbc.updatee(id.getText().toString(),uname.getText().toString(),univ.getText().toString());
                if(r==true)
                    Toast.makeText(getApplicationContext(),"data updated", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"data not updated", Toast.LENGTH_LONG).show();

            }
        });
    }
}