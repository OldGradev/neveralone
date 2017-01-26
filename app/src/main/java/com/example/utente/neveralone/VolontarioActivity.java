package com.example.utente.neveralone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VolontarioActivity extends AppCompatActivity {

    TextView testo;
    Button dettagli;
    Intent intent;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volontario);
        testo = (TextView) findViewById(R.id.implementare_vol);

        dettagli = (Button) findViewById(R.id.dettagli);

        dettagli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(activity, DettagliActivity.class);
                startActivity(intent);
            }
        });
    }
}
