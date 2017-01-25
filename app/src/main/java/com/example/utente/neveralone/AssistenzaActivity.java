package com.example.utente.neveralone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AssistenzaActivity extends AppCompatActivity {

    TextView nameTv;
    Intent intent ;
    String testo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistenza);
        nameTv = (TextView) findViewById(R.id.name_tv);
        if ((intent = getIntent()) != null){
            testo = intent.getStringExtra("testo");
            nameTv.setText(testo);
        }else{
            nameTv.setText("ERRORE");
        }
    }
}
