package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The type Paynow.
 */
public class Paynow extends AppCompatActivity {
private Button b19,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paynow);


        b19=(Button)findViewById(R.id.button19);
        b=(Button)findViewById(R.id.new_button);


        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Paynow.this, Thanku.class);

                startActivity(intent1);
            }
        });





    }
}