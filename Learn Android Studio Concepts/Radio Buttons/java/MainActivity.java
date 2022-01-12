//package com.example.myradiobutton;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.widget.CheckBox;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//    EditText n1, n2, res;
//        CheckBox add, sub, mul, div;
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        n1 = findViewById(R.id.n1);
//        n2 = findViewById(R.id.n2);
//        res = findViewById(R.id.res);
//        add = findViewById(R.id.checkBox);
//        sub = findViewById(R.id.checkBox2);
//        mul = findViewById(R.id.checkBox3);
//        div = findViewById(R.id.checkBox4);
//        add.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    int a = Integer.parseInt(n1.getText().toString());
//                    int b = Integer.parseInt(n2.getText().toString());
//                    res.setText(String.valueOf(a + b));
//                }
//            }
//        });
//        sub.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    int a = Integer.parseInt(n1.getText().toString());
//                    int b = Integer.parseInt(n2.getText().toString());
//                    res.setText(String.valueOf(a - b));
//                }
//            }
//        });
//        mul.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    int a = Integer.parseInt(n1.getText().toString());
//                    int b = Integer.parseInt(n2.getText().toString());
//                    res.setText(String.valueOf(a * b));
//                }
//            }
//        });
//        div.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    int a = Integer.parseInt(n1.getText().toString());
//                    int b = Integer.parseInt(n2.getText().toString());
//                    res.setText(String.valueOf(a / b));
//                }
//            }
//        });
//        }
//}

package com.example.myradiobutton;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {
    EditText n1, n2, res;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        res = findViewById(R.id.res);
        rg=findViewById(R.id.radioGroup);
//        int idx=rg.getCheckedRadioButtonId();
//        rb=findViewById(idx);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb=findViewById(checkedId);
                int a=Integer.parseInt(n1.getText().toString());
                int b=Integer.parseInt(n2.getText().toString());
                if(rb.getText().equals("ADD"))
                {
                    res.setText(String.valueOf(a+b));
                }
                else if(rb.getText().equals("SUB"))
                {
                    res.setText(String.valueOf(a-b));
                }
                else if(rb.getText().equals("MUL"))
                {
                    res.setText(String.valueOf(a*b));
                }
                else{
                    res.setText(String.valueOf(a/b));
                }
            }
        });
    }
}