package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Villalist activity.
 */
public class VillalistActivity extends AppCompatActivity {

    /**
     * The Lst product.
     */
    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotellist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Lakeshore Villas ",".","$1800",R.drawable.lakeshore));
        lstProduct.add(new Product("Villas Davignon",".", "$2100",R.drawable.davig));
        lstProduct.add(new Product("Tremblant Platinum Chalet Rentals","", "$1500",R.drawable.tremblant));


        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
        Button b1;



    }
}