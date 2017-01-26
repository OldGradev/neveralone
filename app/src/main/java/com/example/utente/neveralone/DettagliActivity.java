package com.example.utente.neveralone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DettagliActivity extends AppCompatActivity {

    TextView disagio;
    TextView nomeDisagiato;
    TextView luogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli);

        disagio = (TextView) findViewById(R.id.disagio);
        nomeDisagiato = (TextView) findViewById(R.id.nome_disagiato);
        luogo = (TextView) findViewById(R.id.posizione);
    }
}
