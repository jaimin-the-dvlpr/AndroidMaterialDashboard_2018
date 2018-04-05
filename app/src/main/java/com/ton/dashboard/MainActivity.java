package com.ton.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.ton.dashboard.page.G1;
import com.ton.dashboard.page.G2;
import com.ton.dashboard.page.G3;
import com.ton.dashboard.page.G4;
import com.ton.dashboard.page.G5;
import com.ton.dashboard.page.G6;
import com.ton.dashboard.page.G7;
import com.ton.dashboard.page.G8;
import com.ton.dashboard.page.G9;

public class MainActivity extends AppCompatActivity {


    LinearLayout g1, g2, g3,g4,g5,g6,g7,g8,g9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g7 = findViewById(R.id.g7);
        g8 = findViewById(R.id.g8);
        g9 = findViewById(R.id.g9);


        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten1 = new Intent(MainActivity.this, G1.class);
                startActivity(inten1);
            }
        });


        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten2 = new Intent(MainActivity.this, G2.class);
                startActivity(inten2);
            }
        });


        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten3 = new Intent(MainActivity.this, G3.class);
                startActivity(inten3);
            }
        });


        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten4 = new Intent(MainActivity.this, G4.class);
                startActivity(inten4);
            }
        });


        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten5 = new Intent(MainActivity.this, G5.class);
                startActivity(inten5);
            }
        });


        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten6 = new Intent(MainActivity.this, G6.class);
                startActivity(inten6);
            }
        });


        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten7 = new Intent(MainActivity.this, G7.class);
                startActivity(inten7);
            }
        });

        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten8 = new Intent(MainActivity.this, G8.class);
                startActivity(inten8);
            }
        });

        g9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten9 = new Intent(MainActivity.this, G9.class);
                startActivity(inten9);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}


