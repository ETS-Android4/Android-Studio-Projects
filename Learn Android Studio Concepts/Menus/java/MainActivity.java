package com.example.fatmenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        linearLayout=findViewById(R.id.linearLayout);
        registerForContextMenu(t1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.colors,menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.colors,menu);
        //  menuInflater.inflate(R.menu.colors,menu);
        return true;
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("red"))
        {
            linearLayout.setBackgroundColor(Color.RED);
        }
        if(item.getTitle().equals("blue"))
        {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        if(item.getTitle().equals("green"))
        {
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        return super.onContextItemSelected(item);
    }
   /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menus,menu);
      //  menuInflater.inflate(R.menu.colors,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.add)
        {
            Toast.makeText(getApplicationContext(), "Add contact is selected", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.update)
        {
            Toast.makeText(getApplicationContext(), "Update contact is selected", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.search)
        {
            Toast.makeText(getApplicationContext(), "Search contact is selected", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.addp)
        {
            Toast.makeText(getApplicationContext(), "Add photo to the contact is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }*/
}

/*Uncomment for PopUp Menu

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity{
    TextView t1;
    LinearLayout l;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         t1 = findViewById(R.id.Choosecolor);
         l = findViewById(R.id.linearLayout);
         t1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 PopupMenu popupMenu=new PopupMenu(MainActivity.this,view);
                 popupMenu.inflate(R.menu.colorsfile);
                 popupMenu.show();
                 popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                     @Override
                     public boolean onMenuItemClick(MenuItem menuItem) {
                         if(menuItem.getTitle().equals("yellow"))
                             l.setBackgroundColor(Color.YELLOW);
                         if(menuItem.getTitle().equals("blue"))
                             l.setBackgroundColor(Color.BLUE);
                         if(menuItem.getTitle().equals("green"))
                             l.setBackgroundColor(Color.GREEN);
                         if(menuItem.getTitle().equals("red"))
                             l.setBackgroundColor(Color.RED);
                         return true;
                     }
                 });
             }
         });
     }
}
 */