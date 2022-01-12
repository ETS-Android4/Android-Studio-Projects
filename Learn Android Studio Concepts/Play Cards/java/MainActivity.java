package com.example.playcards;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    final EditText e1 =(EditText)findViewById(R.id.et1);
    final EditText e2 =(EditText)findViewById(R.id.et2);
    final EditText e3 =(EditText)findViewById(R.id.et3);
    final EditText e4 =(EditText)findViewById(R.id.et4);
    final EditText e5 =(EditText)findViewById(R.id.et5);
    final EditText e6 =(EditText)findViewById(R.id.et6);

    final EditText e7 =(EditText)findViewById(R.id.et7);
    final EditText e8 =(EditText)findViewById(R.id.et8);
    final EditText e9 =(EditText)findViewById(R.id.et9);
    final EditText e10 =(EditText)findViewById(R.id.et10);
    final EditText e11 =(EditText)findViewById(R.id.et11);

    Button b1=(Button)findViewById(R.id.b1);
    Button b2=(Button)findViewById(R.id.b2);

    final int arr[]=new int[5];


    b1.setOnClickListener(new View.OnClickListener() { public void onClick(View v)
    {
        Random rand = new Random();
        arr[0]=rand.nextInt(10);
        e1.setText(String.valueOf(arr[0]));
        arr[1]=rand.nextInt(10);
        e2.setText(String.valueOf(arr[1]));
        arr[2]=rand.nextInt(10);
        e3.setText(String.valueOf(arr[2]));
        arr[3]=rand.nextInt(10);
        e4.setText(String.valueOf(arr[3]));
        arr[4]=rand.nextInt(10);
        e5.setText(String.valueOf(arr[4]));

    }
    });
    b2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v){
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
            if (arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        e6.setText(String.valueOf(arr[0]));
        e7.setText(String.valueOf(arr[1]));
        e8.setText(String.valueOf( arr[2]));
        e9.setText(String.valueOf(arr[3] ));
        e10.setText(String.valueOf( arr[4]));
        e11.setText(String.valueOf(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));
    }
});

}
}
