package com.aryotech.kajianyuk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.aryotech.kajianyuk.Adapter.ListPamfletAdapter;
import com.aryotech.kajianyuk.Model.About;
import com.aryotech.kajianyuk.Model.Pamflet;
import com.aryotech.kajianyuk.Model.PamfletData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPamflet;
    ArrayList<Pamflet> list = new ArrayList();
    Toolbar toolbars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPamflet = findViewById(R.id.rv_pamflet);
        rvPamflet.setHasFixedSize(true);


        list.addAll(PamfletData.getListData());
        showRecyclerList();

       toolbars = findViewById(R.id.toolbar);
       setSupportActionBar(toolbars);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id = item.getItemId();

       if (id == R.id.about){
           Toast.makeText(getApplicationContext(),"click about",
                   Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(this, About.class);
           startActivity(intent);
       }
       return true;
    }

    private void showRecyclerList(){
        rvPamflet.setLayoutManager(new LinearLayoutManager(this));
        ListPamfletAdapter listPamfletAdapter = new ListPamfletAdapter(list);
        rvPamflet.setAdapter(listPamfletAdapter);
    }
}
