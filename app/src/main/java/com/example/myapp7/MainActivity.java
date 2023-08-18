package com.example.myapp7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem("card1"));
        listItems.add(new ListItem("card1"));
        listItems.add(new ListItem("card1"));
        listItems.add(new ListItem("card1"));
        listItems.add(new ListItem("card1"));



        ListAdapter adapter = new ListAdapter(this, listItems);
        listView.setAdapter(adapter);
    }
}