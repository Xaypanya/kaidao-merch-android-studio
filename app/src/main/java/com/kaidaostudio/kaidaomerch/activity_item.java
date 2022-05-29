package com.kaidaostudio.kaidaomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity_item extends AppCompatActivity {

    String [][] categoryItem = {
            //BLACKPINK
            {"Album","Photo Book","Merch"},
            //Cherry Bullet
            {"Album"},
            //BTS
            {"Album","Photo Book","Tiny Tan"},
            //ENHYPEN
            {"Album","Merch","DVD"},
    };

    TextView artist_name;
    ListView lsv;

    ArrayAdapter<String> lsvAdpt = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        lsv = findViewById(R.id.lsv);
        artist_name = findViewById(R.id.artist_name);

        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist_name");

        artist_name.setText(artist);


        if(artist.equals("BLACKPINK")){
            lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_listview_item, categoryItem[0]);
        }

        if(artist.equals("Cherry Bullet")){
            lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_listview_item, categoryItem[1]);
        }

        if(artist.equals("BTS")){
            lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_listview_item, categoryItem[2]);
        }

        if(artist.equals("ENHYPEN")){
            lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_listview_item, categoryItem[3]);
        }

        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(activity_item.this, activity_product.class);

                intent.putExtra("artist_name", artist);
                intent.putExtra("product_name", str);
                startActivity(intent);
            }
        });
        lsv.setAdapter(lsvAdpt);


    }
}