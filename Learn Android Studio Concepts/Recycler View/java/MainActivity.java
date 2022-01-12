package com.example.recyclerviewlab10;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private ArrayList<User>usersList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();
        setUserInfo(); setAdapter();
    }
    private void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setUserInfo() {
        usersList.add(new User("Charvi"));
        usersList.add(new User("Rex"));
        usersList.add(new User("Tarun Reddi"));
        usersList.add(new User("Harry Potter"));
        usersList.add(new User("Ron Weasley"));
        usersList.add(new User("Hermione Granger"));
        usersList.add(new User("Ginny Weasley"));
        usersList.add(new User("Chandrika Morthala"));
        usersList.add(new User("Sensai"));
        usersList.add(new User("Samruddhi"));
        usersList.add(new User("Harvey Specter"));
        usersList.add(new User("Mike Ross"));
        usersList.add(new User("Rachael Zane"));

    }
}