package com.example.bach0.hustplant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bach0.hustplant.Adapter.HistoryAdapter;

public class HistoryActivity extends AppCompatActivity {
    RecyclerView list;
    HistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        adapter = new HistoryAdapter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        list = (RecyclerView) findViewById(R.id.history_list);
        adapter.setOnItemClick(this);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setNestedScrollingEnabled(false);
        list.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
