 package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collections;

 public class second extends AppCompatActivity {

    TextView textView1 , textView2 ;
    RecyclerView RecyclerView1;
   // ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

      /*  RecyclerView1=findViewById(R.id.RecyclerView1);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        RecyclerView1.setLayoutManager(manager);
        TwoAdopter twoAdopter = new TwoAdopter(this,twomodels);
        twoAdopter.setItems(twomodels);
        RecyclerView1.setAdapter(twoAdopter);*/
   textView1 =(TextView) findViewById(R.id.text);
        //textView2=(TextView)findViewById(R.id.textView2);
        Intent i=getIntent();
        String brand=i.getStringExtra("Brand Name");

        //String colour=i.getStringExtra("Colour");
        textView1.setText(brand);


        //textView2.setText(colour);
    }
}