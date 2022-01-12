package com.example.cat2adapterview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    String names[]={"Charvi","Tarun","Chandrika","Anchal","Samruddhi","Megana","Charvi","Tarun","Chandrika","Anchal","Samruddhi","Megana","Charvi","Tarun","Chandrika","Anchal","Samruddhi","Megana","Charvi","Tarun","Chandrika","Anchal","Samruddhi","Megana"};
    ListView lv;
    Spinner spinner;
    AutoCompleteTextView textView;
    Boolean wa,insta,sc,twit;
    CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        System.out.println(c1.getId());
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_activated_1,names);
        lv.setAdapter(aa);
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<String> ab=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,names);
        spinner.setAdapter(ab);
        textView=findViewById(R.id.act);
        ArrayAdapter<String> ac=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,names);
        textView.setAdapter(ac);
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    wa=true;
                Toast.makeText(getApplicationContext(), "Whatsapp", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if (checked)
                    insta=true;
                Toast.makeText(getApplicationContext(), "Instagram", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                if (checked)
                    sc=true;
                Toast.makeText(getApplicationContext(), "SnapChat", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:
                if (checked)
                    twit=true;
                Toast.makeText(getApplicationContext(), "Twitter", Toast.LENGTH_SHORT).show();
                break;
        }
}
}