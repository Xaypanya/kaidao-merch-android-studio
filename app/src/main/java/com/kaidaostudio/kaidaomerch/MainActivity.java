package com.kaidaostudio.kaidaomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] groupArtist = {"Girl Group", "Boy Band"};
    String [][] artist = {
            {"BLACKPINK","Cherry Bullet"},
            {"BTS","ENHYPEN"}
    };

    Spinner spn;
    ListView lsv;

    ArrayAdapter<String> spnAdpt = null;
    ArrayAdapter<String> lsvAdpt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        lsv = findViewById(R.id.lsv);

        spnAdpt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, groupArtist);
        spn.setAdapter(spnAdpt);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,artist[position]);
                lsv.setAdapter(lsvAdpt);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String str = parent.getItemAtPosition(position).toString();
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
            }
        });




    }
}