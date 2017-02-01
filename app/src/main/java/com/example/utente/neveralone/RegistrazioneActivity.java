package com.example.utente.neveralone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrazioneActivity extends AppCompatActivity {

    EditText nome, cognome,qualifica, indirizzo, email,username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //devo inizializzare le variabili

        nome = (EditText) findViewById(R.id.name);
        cognome = (EditText) findViewById(R.id.cognome);
        qualifica = (EditText) findViewById(R.id.qualifica);
        indirizzo = (EditText) findViewById(R.id.indirizzo);
        email = (EditText) findViewById(R.id.email);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione);
    }
}
