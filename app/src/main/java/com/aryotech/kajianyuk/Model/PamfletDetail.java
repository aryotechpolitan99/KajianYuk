package com.aryotech.kajianyuk.Model;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aryotech.kajianyuk.MainActivity;
import com.aryotech.kajianyuk.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class PamfletDetail extends AppCompatActivity {

    TextView tvDate, tvDesc, tvTime,tvLoc;
    ImageView imgDesc;
    private LayoutInflater itemView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pamflet_detail);

        tvDate = findViewById(R.id.tv_date);
        tvDesc = findViewById(R.id.tv_detail_desc);
        tvTime = findViewById(R.id.tv_time);
        tvLoc = findViewById(R.id.tv_loc);
        imgDesc = findViewById(R.id.img_detail_pamflet);

        Pamflet pamflet = getIntent().getParcelableExtra("Key");

        tvDate.setText("Hari            : " +pamflet.getDate());
        tvTime.setText("Waktu        : " +pamflet.getTime());
        tvLoc.setText("Tempat      : " +pamflet.getLoc());
        tvDesc.setText("" +pamflet.getDesc());
        Glide.with(this)
                .load(pamflet.getPhoto())
                .apply(new RequestOptions().override(300,180))
                .into(this.imgDesc);


        toolbar = findViewById(R.id.toolbar_back_detail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
