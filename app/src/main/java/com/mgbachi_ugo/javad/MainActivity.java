package com.mgbachi_ugo.javad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mList;
    private ArrayList<String> mInfo;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = new ArrayList<>();
        mList.add("My name:");
        mList.add("Slack username:");
        mList.add("Track:");
        mList.add("Email:");

        mInfo = new ArrayList<>();
        mInfo.add("Mgbachi Ugochukwu");
        mInfo.add("ugwonder");
        mInfo.add("Mobile");
        mInfo.add("ugochukwu_mgbachi@yahoo.com");

        mRecyclerView = findViewById(R.id.list_items);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new InfoRecyclerAdapter(mList, mInfo);
        mRecyclerView.setAdapter(adapter);

    }




}
