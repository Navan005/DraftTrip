package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProductActivity extends AppCompatActivity {

    ImageView hotel;
    ImageView apartment;
    ImageView cabin;
    ImageView villa;
    ImageView cottage;
    ImageView country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);



        //Imageviews are assigned to the declared variables.


        hotel = (ImageView)  findViewById(R.id.hotel_img);
        apartment = (ImageView)  findViewById(R.id.apartment_img);
        cabin = (ImageView)  findViewById(R.id.cabin_img);
        villa = (ImageView)  findViewById(R.id.villa_img);
        cottage = (ImageView)  findViewById(R.id.cottage_img);
        country = (ImageView)  findViewById(R.id.country_img);



        //Dairy
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, HotellistActivity.class);
                startActivity(intent);
            }
        });

        //Beverage
        apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, ApartmentlistActivity.class);
                startActivity(intent);
            }
        });


        //Snacks
        cabin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, CabinlistActivity.class);
                startActivity(intent);
            }
        });

        //Frozen
       villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, VillalistActivity.class);
                startActivity(intent);
            }
        });

        //Bread
       cottage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, CottagelistActivity.class);
                startActivity(intent);
            }
        });


        //Beer
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, CountrylistActivity.class);
                startActivity(intent);
            }
        });







    }


}


