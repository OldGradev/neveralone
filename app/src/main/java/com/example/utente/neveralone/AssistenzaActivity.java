package com.example.utente.neveralone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AssistenzaActivity extends AppCompatActivity {

    Activity activity = this;

    Button assistenza;
    Button malori;
    Button medicinali;
    Button spesa;

    TextView testo;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistenza);
        testo = (TextView) findViewById(R.id.disagiato);

        malori = (Button) findViewById(R.id.malori);
        medicinali = (Button) findViewById(R.id.medicinali);
        assistenza = (Button) findViewById(R.id.assistenza);
        spesa = (Button) findViewById(R.id.spesa);

        assistenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(activity,MessaggioActivity.class);
                startActivity(intent);

            }
        });

        malori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(activity,MessaggioActivity.class);
                startActivity(intent);

            }
        });

        medicinali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(activity,MessaggioActivity.class);
                startActivity(intent);

            }
        });

        spesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(activity,MessaggioActivity.class);
                startActivity(intent);

            }
        });
    }
}