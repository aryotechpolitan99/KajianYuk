package com.aryotech.kajianyuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aryotech.kajianyuk.Adapter.ListPamfletAdapter;
import com.aryotech.kajianyuk.Model.Pamflet;
import com.aryotech.kajianyuk.Model.PamfletData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPamflet;
    ArrayList<Pamflet> list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPamflet = findViewById(R.id.rv_pamflet);
        rvPamflet.setHasFixedSize(true);


        list.addAll(PamfletData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvPamflet.setLayoutManager(new LinearLayoutManager(this));
        ListPamfletAdapter listPamfletAdapter = new ListPamfletAdapter(list);
        rvPamflet.setAdapter(listPamfletAdapter);
    }
}
