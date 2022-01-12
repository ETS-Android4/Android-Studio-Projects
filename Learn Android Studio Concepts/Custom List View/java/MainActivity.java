package com.example.cat2listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String names[] = {"Apple", "Banana", "Grapes", "Kiwi", "Oranges"};
    String desc[] = {"Apple 100Rs", "Banana 60Rs", "Grapes 80Rs", "Kiwi 200Rs", "Oranges 130Rs"};
    int images[] = {R.drawable.apple, R.drawable.banana, R.drawable.grapes, R.drawable.kiwi, R.drawable.oranges};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lv=findViewById(R.id.lv);
        lv.setAdapter(new MyAdapter(this));
    }

    private class MyAdapter extends BaseAdapter {
        Context context;

        public MyAdapter(MainActivity mainActivity) {
            context = mainActivity;
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View V = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup, false);
            TextView t1 = V.findViewById(R.id.textView);
            TextView t2 = V.findViewById(R.id.textView2);
            ImageView img = V.findViewById(R.id.imageView);
            t1.setText(names[i]);
            t2.setText(desc[i]);
            img.setImageResource(images[i]);

            V.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Closing here", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("names", names[i]);
                    intent.putExtra("image", images[i]);
                    intent.putExtra("desc", desc[i]);
                    startActivity(intent);
                }
            });
            return V;

        }
    }
}
