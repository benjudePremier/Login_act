package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Declaraciones de variables
    private EditText edit;
    private EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aqui voy llamando elementos por id
        edit = (EditText) findViewById(R.id.nom);
        edit1 = (EditText) findViewById(R.id.cont);
    }

    public void Iniciar(View v) {
        if (edit.getText().toString().equals("Android") && edit1.getText().toString().equals("123")) {
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
        }
       else if (edit.getText().toString().equals("android") && edit1.getText().toString().equals("123")) {

            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
       }
    }
}




