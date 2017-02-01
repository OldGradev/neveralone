package com.example.utente.neveralone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class VolontarioActivity extends AppCompatActivity {

    Intent intent;

    RecyclerView disagioRV;
    RecyclerView.LayoutManager layoutManager;
    VolontarioAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volontario);

        intent = getIntent();

        disagioRV=(RecyclerView)findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        adapter = new VolontarioAdapter();

        disagioRV.setLayoutManager(layoutManager);
        disagioRV.setAdapter(adapter);
        fetchDisagi();
    }

    private void fetchDisagi(){

        ArrayList<Disagio> disagii = new ArrayList<>();

        Disagio d1 = new Disagio("ho un malore al cuore","via carlo ","malore Cuore","Mario Rossi");
        Disagio d2 = new Disagio("ho un malore alla testa","via carlo martino","malore Testa","Maria Gialli");
        Disagio d3 = new Disagio("ho bisogno di compagnia","via  martino","Compagnia","Carmelo Giorgio");
        Disagio d4 = new Disagio("ho bisogno di compagnia","via  martino","Compagnia","Carmelo Giorgio");
        Disagio d5 = new Disagio("ho bisogno di compagnia","via  martino","Compagnia","Carmelo Giorgio");
        Disagio d6 = new Disagio("ho bisogno di compagnia","via  martino","Compagnia","Carmelo Giorgio");
        Disagio d7 = new Disagio("ho bisogno di compagnia","via  martino","Compagnia","Carmelo Giorgio");

        disagii.add(d1);
        disagii.add(d2);
        disagii.add(d3);
        disagii.add(d4);
        disagii.add(d5);
        disagii.add(d6);
        disagii.add(d7);

        adapter.setDataSet(disagii);

    }
}
