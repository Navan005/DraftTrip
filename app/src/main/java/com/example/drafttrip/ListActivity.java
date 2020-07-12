package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    ImageView hotel;
    ImageView apartment;
    ImageView villa;
    ImageView cottage;
    ImageView country;
    ImageView cabin;

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
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        cabin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        cottage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });
    }
}
