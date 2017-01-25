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

    TextView welcomeTv;
    Button changeTextBtn;
    EditText changeTextEdit;
    TextView count;
    Button changePage;
    Activity activity=this;
    Button delete;

    int x=0;
    String testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeTv = (TextView) findViewById(R.id.welcome_tv);
        changeTextBtn = (Button) findViewById(R.id.change_text_btn);
        changeTextEdit = (EditText) findViewById(R.id.change_text_hint);
        count = (TextView) findViewById(R.id.count_x);

        changePage = (Button) findViewById(R.id.change_page);
        delete = (Button) findViewById(R.id.delete);

        changeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                welcomeTv.setText(changeTextEdit.getText());
                count.setText("" + x);
            }
        });

        changePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                testo = welcomeTv.getText().toString();
                Intent intent = new Intent(activity,AssistenzaActivity.class);
                intent.putExtra("testo", testo);
                startActivity(intent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeTv.setText("");
                changeTextEdit.setText("");
                count.setText("0");
            }
        });
    }
}
