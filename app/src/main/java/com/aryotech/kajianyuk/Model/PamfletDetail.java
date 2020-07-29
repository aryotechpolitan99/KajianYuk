package com.aryotech.kajianyuk.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.aryotech.kajianyuk.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class PamfletDetail extends AppCompatActivity {

    TextView tvDate, tvDesc, tvTime,tvLoc;
    ImageView imgDesc;
    private LayoutInflater itemView;

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

    }
}
