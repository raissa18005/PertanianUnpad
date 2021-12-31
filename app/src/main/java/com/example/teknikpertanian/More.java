package com.example.teknikpertanian;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class More extends AppCompatActivity implements View.OnClickListener{

    CardView deskripsiCard,visiCard,sejarahCard,dosenCard,strukturCard,lulusanCard,kurikulumCard,fasilitasCard;
    Toolbar toolbar;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        toolbar = findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);

        mTitle.setText(toolbar.getTitle());

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        deskripsiCard = (CardView) findViewById(R.id.deskripsi_card);
        visiCard = (CardView) findViewById(R.id.visi_card);
        sejarahCard = (CardView) findViewById(R.id.sejarah_card);
        dosenCard = (CardView) findViewById(R.id.dosen_card);
        strukturCard = (CardView) findViewById(R.id.struktur_card);
        lulusanCard = (CardView) findViewById(R.id.lulusan_card);
        kurikulumCard = (CardView) findViewById(R.id.kurikulum_card);
        fasilitasCard = (CardView) findViewById(R.id.fasilitas_card);

        deskripsiCard.setOnClickListener(this);
        visiCard.setOnClickListener(this);
        sejarahCard.setOnClickListener(this);
        dosenCard.setOnClickListener(this);
        strukturCard.setOnClickListener(this);
        lulusanCard.setOnClickListener(this);
        kurikulumCard.setOnClickListener(this);
        fasilitasCard.setOnClickListener(this);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.deskripsi_card : i = new Intent(this,Deskripsi.class);startActivity(i); break;
            case R.id.visi_card : i = new Intent(this,VisiMisi.class);startActivity(i); break;
            case R.id.dosen_card : i = new Intent(this,Dosen.class);startActivity(i); break;
            case R.id.kurikulum_card : i = new Intent(this,Kurikulum.class);startActivity(i); break;
            case R.id.lulusan_card : i = new Intent(this,Lulusan.class);startActivity(i); break;
            case R.id.struktur_card : i = new Intent(this,Struktur.class);startActivity(i); break;
            case R.id.sejarah_card : i = new Intent(this,Sejarah.class);startActivity(i); break;
            case R.id.fasilitas_card : i = new Intent(this,Fasilitas.class);startActivity(i); break;
            case R.id.more_card : i = new Intent(this,More.class);startActivity(i); break;
            default:break;
        }
    }
}