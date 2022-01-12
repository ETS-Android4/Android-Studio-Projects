package com.example.cat2alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.zip.DeflaterInputStream;
/*
public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                EditText e1=new EditText(MainActivity.this);
                builder.setTitle("Read the data");
                builder.setIcon(R.drawable.c);
                builder.setView(e1);
                builder.setMessage("Enter number ");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int a=Integer.parseInt(e1.getText().toString());
                        if(a%2==0)
                            Toast.makeText(getApplicationContext(),"Even number entered", Toast.LENGTH_LONG).show();
                        else{
                            Toast.makeText(getApplicationContext(),"odd number entered",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Enter the value less than 100 only", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
                builder.setNeutralButton("skip", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
            }
        });
    }
}
*/
//Another Application uncomment:
public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                String names[] = {"camera", "bluetooth", "printer", "usb"};
                boolean check[] = new boolean[names.length];
                builder.setTitle("Read the data");
                builder.setIcon(R.drawable.c);

                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "positive clicked", Toast.LENGTH_LONG).show();
//                        finish();
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
                builder.setNeutralButton("skip", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setSingleChoiceItems(names, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), names[which], Toast.LENGTH_LONG).show();
                    }
                });
                //uncomment to have multiple selections and comment setSingleChoiceItems
//                builder.setMultiChoiceItems(names, check, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//                        if (isChecked) {
//                            Toast.makeText(getApplicationContext(), names[which], Toast.LENGTH_LONG).show();
//                        }
//                    }
//                });

                builder.create().show();
            }
        });
    }
}
