package com.example.utente.neveralone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MessaggioActivity extends AppCompatActivity {

    TextView testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaggio);

        testo = (TextView) findViewById(R.id.messaggio);
    }
}
