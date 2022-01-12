package com.example.shippingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit, clear;
    EditText unoid,wifimoduleid,bluetoothid,unopri,wifimodulepri,bluetoothpri;
    TextView Total_amt,titleid,itemid,qtyid,arduinoid,wifiid,btid,amtid;

    int unocost=500,wificost=250,bluetoothcost=150,total=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Successfully Launched", Toast.LENGTH_LONG).show();
        submit = (Button)findViewById(R.id.submit);
        clear = (Button)findViewById(R.id.clear);

        unoid =(EditText)findViewById(R.id.unoid);
        wifimoduleid =(EditText)findViewById(R.id.wifimoduleid);
        bluetoothid =(EditText)findViewById(R.id.bluetoothid);

        unopri =(EditText)findViewById(R.id.unoprice);
        wifimodulepri =(EditText)findViewById(R.id.wifimoduleprice);
        bluetoothpri =(EditText)findViewById(R.id.bluetoothprice);

        unoid.setText("");
        wifimoduleid.setText("");
        bluetoothid.setText("");

        titleid=(TextView)findViewById(R.id.titleid);
        itemid=(TextView)findViewById(R.id.itemid);
        qtyid=(TextView)findViewById(R.id.qtyid);
        arduinoid=(TextView)findViewById(R.id.arduinoid);
        wifiid=(TextView)findViewById(R.id.wifiid);
        btid=(TextView)findViewById(R.id.btid);
        amtid=(TextView)findViewById(R.id.amtid);
        Total_amt=(TextView)findViewById(R.id.Total_amt);

        Total_amt.setText("Rs. 0/-");


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unocost=Integer.parseInt(String.valueOf(unopri.getText()));
                wificost=Integer.parseInt(String.valueOf(wifimodulepri.getText()));
                bluetoothcost=Integer.parseInt(String.valueOf(bluetoothpri.getText()));

                total = ((Integer.parseInt(unoid.getText() + "")) * unocost) +
                        ((Integer.parseInt(wifimoduleid.getText() + "")) * wificost) +
                        ((Integer.parseInt(bluetoothid.getText() + "")) * bluetoothcost);

                Total_amt.setText("Rs. "+ total + "/-");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unopri.setText("");
                wifimodulepri.setText("");
                bluetoothpri.setText("");
                unoid.setText("");
                wifimoduleid.setText("");
                bluetoothid.setText("");
                total=0;
                Total_amt.setText("Rs.0/-");
            }
        });
    }
}
