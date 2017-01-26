package com.example.utente.neveralone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Utente on 25/01/2017.
 */
public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    Button login;
    Button delete;
    Activity activity=this;

    String testo2;
    String testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


        login = (Button) findViewById(R.id.login);
        delete = (Button) findViewById(R.id.delete);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                testo = username.getText().toString();
                testo2 = password.getText().toString();

                //controllo db per le credenziali del login

                Intent intent;

                if((testo.toLowerCase()).equals("volontario") && ((testo2.equals("123")))){
                    intent = new Intent(activity,VolontarioActivity.class);
                    startActivity(intent);

                }

                if((testo.toLowerCase()).equals("mario") && ((testo2.equals("123")))) {
                    intent = new Intent(activity,AssistenzaActivity.class);
                    startActivity(intent);

                }else{
                    username.setText("");
                    password.setText("");
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
            }
        });
    }
}
