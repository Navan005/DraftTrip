package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Cottagelist activity.
 */
public class CottagelistActivity extends AppCompatActivity {
    /**
     * The Lst product.
     */
    List<Product> lstProduct;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cottagelist);




        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Cottages Canada", ".", "$800", R.drawable.cottages));
        lstProduct.add(new Product("CozyCottages - Lakefront cottage rental Laurent", ".", "$650", R.drawable.lakefront));
        lstProduct.add(new Product("Tree Tops Cottages", "", "$125", R.drawable.treetop));


        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this, 1));
        recyclev.setAdapter(myAdapter);
        Button b1;






    }





}


