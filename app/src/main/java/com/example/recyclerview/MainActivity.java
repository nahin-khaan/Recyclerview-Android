package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    int[] flag={R.drawable.afghanistan,R.drawable.australia,R.drawable.bangladesh,R.drawable.canada,R.drawable.china};
    String[] title,descr;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=findViewById(R.id.recycleId);
        title=getResources().getStringArray(R.array.country);
        descr=getResources().getStringArray(R.array.famous);
        myAdapter=new MyAdapter(this,title,descr,flag);
        recycle.setAdapter(myAdapter);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}