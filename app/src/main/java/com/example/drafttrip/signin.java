package com.example.drafttrip;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Signin.
 */
public class signin extends AppCompatActivity {

        private EditText etLoginGmail;
        private EditText etLoginPassword;
    private Cursor cursor;
    private SQLiteDatabase db;
    private SQLiteOpenHelper openHelper;


        /**
        *create method
        */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
Button b1 = (Button)findViewById(R.id.btnLogin);
        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
        etLoginGmail = findViewById(R.id.etLogGmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        final MediaPlayer media = MediaPlayer.create(this,R.raw.beep);





        b1.setOnClickListener(new View.OnClickListener() {
                /**
                *listener
                */
            public void onClick(View v) {
                openActivity2();
            }
        });
media.start();





    }

        /**
        *connecting the Database 
        *using database helper 
        *confirming the authentication
        */
    private void openActivity2()
    {
        String email = etLoginGmail.getText().toString().trim();
        String password = etLoginPassword.getText().toString().trim();
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(signin.this, "Enter your Email and Password to login", Toast.LENGTH_SHORT).show();
        } else {
            cursor = db.rawQuery("SELECT *FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_4 + "=? AND " + DatabaseHelper.COL_5 + "=?", new String[]{email, password});
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    startActivity(new Intent(signin.this, ListActivity.class));
                    Toast.makeText(getApplicationContext(), "Login sucess", Toast.LENGTH_SHORT).show();//for success

                } else {
                    Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();// for error
                }
            }
        }
    }


}
