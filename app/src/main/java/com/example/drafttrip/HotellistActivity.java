package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HotellistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotellist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Ritz-Clarton",".","$476",R.drawable.ritz));
        lstProduct.add(new Product("Le Crystal",".", "$298",R.drawable.crystal));
        lstProduct.add(new Product("Holiday Inn","", "$125",R.drawable.holidayinn));


        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}