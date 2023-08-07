package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Model>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initData();
        initRecyclerView();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new Model(R.drawable.ingagi, "test1", "10:43AM", "How are you", "____________________________________"));
        userList.add(new Model(R.drawable.ingwe, "test2", "09:20AM", "I'm Fine", "____________________________________"));
        userList.add(new Model(R.drawable.impala, "test3", "12:45PM", "How are you", "____________________________________"));
        userList.add(new Model(R.drawable.inzovu, "admin1", "10:43AM", "are you sure", "____________________________________"));
        userList.add(new Model(R.drawable.impala, "admin2", "1:40AM", "yeah it's Okay", "____________________________________"));
        userList.add(new Model(R.drawable.ingwe, "test2", "10:43AM", "How are you", "____________________________________"));
        userList.add(new Model(R.drawable.impala, "test1", "12:45PM", "How are you", "____________________________________"));
        userList.add(new Model(R.drawable.inzovu, "admin3", "10:43AM", "are you sure", "____________________________________"));
        userList.add(new Model(R.drawable.impala, "admin", "1:40AM", "yeah it's Okay", "____________________________________"));
        userList.add(new Model(R.drawable.ingagi, "admin1", "10:43AM", "How are you", "____________________________________"));
        userList.add(new Model(R.drawable.ingwe, "test", "09:20AM", "I'm Fine", "____________________________________"));
        userList.add(new Model(R.drawable.impala, "test1", "12:45PM", "How are you", "____________________________________"));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}