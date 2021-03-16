package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Qollanma extends AppCompatActivity {
  private RecyclerView recycle;
  private RecyclerView.Adapter  adapter;
  private RecyclerView.LayoutManager  layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qollanma);
        ArrayList<Item>  itemList=new  ArrayList<Item>();
        itemList.add(new  Item(R.drawable.directions,"YOLANISHLAR"));
        itemList.add(new  Item(R.drawable.trafficlights,"SVETOFOR"));
        itemList.add(new  Item(R.drawable.restrictionends,"YOL OXIRI"));
        itemList.add(new  Item(R.drawable.yield,"YOL  YOQ"));
        itemList.add(new  Item(R.drawable.prohibition,"TAQIQ"));
        itemList.add(new  Item(R.drawable.barrier,"TAQIQ"));
        itemList.add(new  Item(R.drawable.noentry,"KIRISH-TAQIQLANGAN"));

        this.recycle=findViewById(R.id.recycler);
        this.layout=new LinearLayoutManager(this);
        this.adapter=new ItemRecyclerView(itemList);
        this.recycle.setLayoutManager(this.layout);
        this.recycle.setAdapter(adapter);

    }
    public void orqaga(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
