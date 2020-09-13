package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The type Thanku.
 */
public class Thanku extends AppCompatActivity {
private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanku);
        final MediaPlayer media = MediaPlayer.create(this,R.raw.beep);




        b=(Button)findViewById(R.id.new_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Thanku.this, ListActivity.class);
                media.start();
                startActivity(intent1);
            }
        });

    }
}