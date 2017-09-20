package com.example.listviewwithcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        // Create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(adapter);


        // Add item to adapter
        adapter.add(new User("Nathan", "San Diego"));
        adapter.add(new User("John", "New York"));
        adapter.add(new User("Pedro", "Mexico"));

    }
}
