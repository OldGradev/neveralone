package com.example.utente.neveralone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Utente on 25/01/2017.
 */
public class MainActivity extends Activity {


    EditText username;
    EditText password;
    Button login;
    TextView registrati;
    TextView pswDimenticata;
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
        registrati = (TextView) findViewById(R.id.register);
        pswDimenticata= (TextView) findViewById(R.id.pswdimenticata);

        pswDimenticata.setVisibility(View.INVISIBLE);

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

                    pswDimenticata.setVisibility(View.INVISIBLE);
                }

                if((testo.toLowerCase()).equals("mario") && ((testo2.equals("123")))) {
                    intent = new Intent(activity,AssistenzaActivity.class);
                    startActivity(intent);

                    pswDimenticata.setVisibility(View.INVISIBLE);
                }else{
                    username.setText("");
                    password.setText("");

                    pswDimenticata.setVisibility(View.VISIBLE);
                }
            }
        });

        pswDimenticata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(v.getContext(),"Password dimenticata", Toast.LENGTH_LONG).show();
            }
        });

        registrati.setOnClickListener(new View.OnClickListener() {

            Intent intent;

            @Override
            public void onClick(View v) {
                intent = new Intent(activity,RegistrazioneActivity.class);
                startActivity(intent);
            }
        });
    }
}
