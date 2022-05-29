package com.kaidaostudio.kaidaomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
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

        spnAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_spinner_item, groupArtist);
        spn.setAdapter(spnAdpt);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lsvAdpt = new ArrayAdapter<String>(getApplicationContext(), R.layout.kaidao_listview_item,artist[position]);
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
                    Intent intent = new Intent(MainActivity.this, activity_item.class);

                    intent.putExtra("artist_name", str);
                    startActivity(intent);
            }
        });




    }
}