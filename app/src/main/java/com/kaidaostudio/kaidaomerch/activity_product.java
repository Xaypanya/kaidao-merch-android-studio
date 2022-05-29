package com.kaidaostudio.kaidaomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class activity_product extends AppCompatActivity {

    String [][] blackpinkItems = {
            //Album (Name + Image src)
            {"LISA FIRST SINGLE ALBUM Black Ver.","LISA FIRST SINGLE ALBUM Gold Ver.","LISA FIRST SINGLE ALBUM Kit Ver."},
            //Photo Book (Name + Image src)
            {"LALISA PHOTOBOOK VOL.1","LALISA PHOTOBOOK VOL.2","LALISA PHOTOBOOK VOL.3"},
            //Merch (Name + Image src)
            {"[H.Y.L.T] BALLCAP","[H.Y.L.T] BUCKETHAT","[H.Y.L.T] CROPPED HOODIE_DARK GRAY"},
    };

    int [][] blackpinkItemsImage = {
            {R.drawable.bp_album_1, R.drawable.bp_album_2, R.drawable.bp_album_3},
            {R.drawable.bp_photobook_1, R.drawable.bp_photobook_2, R.drawable.bp_photobook_3},
            {R.drawable.bp_merch_1, R.drawable.bp_merch_2, R.drawable.bp_merch_3}
    };

    String [][] cherryBulletItems = {
            //Album (Name + Image src)
            {"1st Mini Album Cherry","2nd Single Album [LOVE ADVENTURE]","1st Single Album [Let's Play Cherry Bullet]"},
    };

    int [][] cherryBulletItemsImage = {
            {R.drawable.cr_album_1,R.drawable.cr_album_2,R.drawable.cr_album_3},
    };

    String [][] btsItems = {
            //Album (Name + Image src)
            {"Proof (Set)","BE (Deluxe Edition)","BUTTER (SET)"},
            //Photo Book (Name + Image src)
            {"BTS PHOTOTOBOOK CLUE VER.","BTS PHOTOBOOK ROUTE VER.","BTS PHOTOBOOK SPECIAL SET"},
            //Tiny Tan (Name + Image src)
            {"Figure BUTTER","Masking Tape","Mini Pouch"},
    };

    int [][] btsItemsImage = {
            {R.drawable.bts_album_1, R.drawable.bts_album_2, R.drawable.bts_album_3},
            {R.drawable.bts_photobook_1, R.drawable.bts_photobook_2, R.drawable.bts_photobook_3},
            {R.drawable.bts_tinytan_1, R.drawable.bts_tinytan_2, R.drawable.bts_tinytan_3}
    };

    String [][] enhyphenItems = {
            //Album (Name + Image src)
            {"BORDER: CANIVAL (Random)","BORDER: DAY ONE","JP 1st Single"},
            //Merch Book (Name + Image src)
            {"[JUNGWON] 3D Photo","[JUNGWON] Wish Bracelet (Gold)","[JUNGWON] Deco Sticker"},
            //DVD (Name + Image src)
            {"2021 FANMEETING","Memories: Step 1 DIGITAL CODE","PIECES OF MEMORIES"},
    };

    int [][] enhyphenItemsImage = {
            {R.drawable.ep_album_1, R.drawable.ep_album_2, R.drawable.ep_album_3},
            {R.drawable.ep_merch_1, R.drawable.ep_merch_2, R.drawable.ep_merch_3},
            {R.drawable.ep_dvd_1,R.drawable.ep_dvd_2, R.drawable.ep_dvd_3}
    };

    TextView artist_name, product_name;
    ListView lsv;

    ArrayAdapter<String> lsvAdpt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        artist_name = findViewById(R.id.artist_name);
        product_name = findViewById(R.id.product_name);
        lsv = findViewById(R.id.lsv);

        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist_name");
        String pro_name = intent.getStringExtra("product_name");

        artist_name.setText(artist);
//        product_name.setText(pro_name);

        String [] productItems = null;
        int [] imageItems = null;

        if(artist.equals("BLACKPINK")){
            if(pro_name.equals("Album")){
                productItems = blackpinkItems[0];
            }else if(pro_name.equals("Photo Book")){
                productItems = blackpinkItems[1];
            }else if(pro_name.equals("Merch")){
                productItems = blackpinkItems[2];
            }
        }

        if(artist.equals("Cherry Bullet")){
            if(pro_name.equals("Album")){
                productItems = cherryBulletItems[0];
            }
        }

        if(artist.equals("BTS")){
            if(pro_name.equals("Album")){
                productItems = btsItems[0];
            }else if(pro_name.equals("Photo Book")){
                productItems = btsItems[1];
            }else if(pro_name.equals("Tiny Tan")){
                productItems = btsItems[2];
            }
        }

        if(artist.equals("ENHYPEN")){
            if(pro_name.equals("Album")){
                productItems = enhyphenItems[0];
            }else if(pro_name.equals("Merch")){
                productItems = enhyphenItems[1];
            }else if(pro_name.equals("DVD")){
                productItems = enhyphenItems[2];
            }
        }

        product_name.setText(productItems[1]);



    }

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}