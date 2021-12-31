package com.example.teknikpertanian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView deskripsiCard,visiCard,sejarahCard,dosenCard,strukturCard,kurikulumCard,fasilitasCard,moreCard;
    ImageView youtubeCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deskripsiCard = (CardView) findViewById(R.id.deskripsi_card);
        visiCard = (CardView) findViewById(R.id.visi_card);
        sejarahCard = (CardView) findViewById(R.id.sejarah_card);
        dosenCard = (CardView) findViewById(R.id.dosen_card);
        strukturCard = (CardView) findViewById(R.id.struktur_card);
        kurikulumCard = (CardView) findViewById(R.id.kurikulum_card);
        fasilitasCard = (CardView) findViewById(R.id.fasilitas_card);
        moreCard = (CardView) findViewById(R.id.more_card);

        deskripsiCard.setOnClickListener(this);
        visiCard.setOnClickListener(this);
        sejarahCard.setOnClickListener(this);
        dosenCard.setOnClickListener(this);
        strukturCard.setOnClickListener(this);
        kurikulumCard.setOnClickListener(this);
        fasilitasCard.setOnClickListener(this);
        moreCard.setOnClickListener(this);

        youtubeCard = findViewById(R.id.youtube_card);

        youtubeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.youtube.com/watch?v=ImfTD6uq2Qs");
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.deskripsi_card : i = new Intent(this,Deskripsi.class);startActivity(i); break;
            case R.id.visi_card : i = new Intent(this,VisiMisi.class);startActivity(i); break;
            case R.id.dosen_card : i = new Intent(this,Dosen.class);startActivity(i); break;
            case R.id.kurikulum_card : i = new Intent(this,Kurikulum.class);startActivity(i); break;
            case R.id.struktur_card : i = new Intent(this,Struktur.class);startActivity(i); break;
            case R.id.sejarah_card : i = new Intent(this,Sejarah.class);startActivity(i); break;
            case R.id.fasilitas_card : i = new Intent(this,Fasilitas.class);startActivity(i); break;
            case R.id.more_card : i = new Intent(this,More.class);startActivity(i); break;
            default:break;
        }

    }

    private void gotoURL(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}