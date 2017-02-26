package com.example.yelaman.allahnames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Name> nameList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.relativeLayout);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(new NameAdapter(this, nameList));
        populateList();
    }

    private void populateList() {
        nameList.add(new Name("Алла", "Алла", "Алла"));
        nameList.add(new Name("Рахман", "Аса қамқор", "Рахман"));
        nameList.add(new Name("Рахим", "Ерекше мейірімді", "Рахим"));
        nameList.add(new Name("Алла", "Алла", "Алла"));
        nameList.add(new Name("Рахман", "Аса қамқор", "Рахман"));
        nameList.add(new Name("Рахим", "Ерекше мейірімді", "Рахим"));
        nameList.add(new Name("Алла", "Алла", "Алла"));
        nameList.add(new Name("Рахман", "Аса қамқор", "Рахман"));
        nameList.add(new Name("Рахим", "Ерекше мейірімді", "Рахим"));
        nameList.add(new Name("Алла", "Алла", "Алла"));
        nameList.add(new Name("Рахман", "Аса қамқор", "Рахман"));
        nameList.add(new Name("Рахим", "Ерекше мейірімді", "Рахим"));
    }
}
