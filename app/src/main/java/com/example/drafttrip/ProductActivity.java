package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * The type Product activity.
 */
public class ProductActivity extends AppCompatActivity {

    /**
     * The Hotel.
     */
    ImageView hotel;
    /**
     * The Apartment.
     */
    ImageView apartment;
    /**
     * The Cabin.
     */
    ImageView cabin;
    /**
     * The Villa.
     */
    ImageView villa;
    /**
     * The Cottage.
     */
    ImageView cottage;
    /**
     * The Country.
     */
    ImageView country;

    /**
    *Image views are assigned
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        hotel = (ImageView)  findViewById(R.id.hotel_img);
        apartment = (ImageView)  findViewById(R.id.apartment_img);
        cabin = (ImageView)  findViewById(R.id.cabin_img);
        villa = (ImageView)  findViewById(R.id.villa_img);
        cottage = (ImageView)  findViewById(R.id.cottage_img);
        country = (ImageView)  findViewById(R.id.country_img);



        /**
        * Dairy
        */
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


        /**
        *Snacks
        */
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

        /**
        *Bread
        */
       cottage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, CottagelistActivity.class);
                startActivity(intent);
            }
        });


        /**
        *Beer
        */
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, CountrylistActivity.class);
                startActivity(intent);
            }
        });







    }


}


