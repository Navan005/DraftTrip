package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.drafttrip.R.drawable.ritz;

/**
 * The type List activity.
 */
public class ListActivity extends AppCompatActivity {

    /**
     * The Hotel.
     */
    ImageView hotel;
    /**
     * The Apartment.
     */
    ImageView apartment;
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
     * The Cabin.
     */
    ImageView cabin;
    /**
     * The Ritz 1.
     */
    ImageView ritz1;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        hotel = (ImageView)  findViewById(R.id.hotel_img);
        apartment = (ImageView)  findViewById(R.id.apartment_img);
        villa = (ImageView)  findViewById(R.id.villa_img);
        cottage = (ImageView)  findViewById(R.id.cottage_img);
        country = (ImageView)  findViewById(R.id.country_img);
        cabin = (ImageView)  findViewById(R.id.cabin_img);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, HotellistActivity.class);
                startActivity(intent);
            }
        });

        apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ListActivity.this, ApartmentlistActivity.class);
                startActivity(intent1);
            }
        });

        villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(ListActivity.this, VillalistActivity.class);
                startActivity(intent2);
            }
        });

        cabin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(ListActivity.this, CabinlistActivity.class);
                startActivity(intent3);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(ListActivity.this, CountrylistActivity.class);
                startActivity(intent4);
            }
        });

        cottage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(ListActivity.this, CottagelistActivity.class);
                startActivity(intent5);
            }
        });





    }
}
