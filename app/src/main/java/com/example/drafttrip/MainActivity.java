package com.example.drafttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    private Button signup;
    private Button login;
    private Button contact;
    private Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

final MediaPlayer media = MediaPlayer.create(this,R.raw.beep);


        TextView v = (TextView) findViewById(R.id.textView2);
        v.setSelected(true);
signup=(Button)findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, RegisterActivity.class);
                media.start();
                startActivity(intent1);
            }
        });

        login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, signin.class);
                media.start();
                startActivity(intent1);
            }
        });
        contact=(Button)findViewById(R.id.button4);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, Contact.class);
                media.start();
                startActivity(intent1);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.contact){
            Intent intent=new Intent(MainActivity.this,Contact.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.about){
            Intent intent=new Intent(MainActivity.this,Aboutus.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
}
