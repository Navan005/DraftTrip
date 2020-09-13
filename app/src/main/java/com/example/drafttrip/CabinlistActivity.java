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
 * The type Cabinlist activity.
 */
public class CabinlistActivity extends AppCompatActivity {

    /**
     * The Lst product.
     */
    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabinlist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Stowe Cabins in the Woods",".","$129",R.drawable.stowe));
        lstProduct.add(new Product("Cochran's Cabins",".", "$140",R.drawable.coch));
        lstProduct.add(new Product("Lake Clear Lodge Cabins","", "96",R.drawable.lake));


        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);








    }

}