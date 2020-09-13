package com.example.drafttrip;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.example.drafttrip.R.drawable.ritz;

/**
 * The type Hotellist activity.
 */
public class HotellistActivity extends AppCompatActivity {

    /**
     * The Lst product.
     */
    List<Product> lstProduct ;
    /**
     * The B 1.
     */
    Button b1;
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotellist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Ritz-Clarton",".","$476", ritz));
        lstProduct.add(new Product("Le Crystal",".", "$298", R.drawable.crystal));
        lstProduct.add(new Product("Holiday Inn","", "$125", R.drawable.holidayinn));


        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);


        b1 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(HotellistActivity.this, Paynow.class);
                startActivity(intent5);
            }
        });





    }







}