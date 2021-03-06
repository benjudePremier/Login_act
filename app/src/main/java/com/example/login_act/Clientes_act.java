package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Clientes_act extends AppCompatActivity {
    // Declaraciones de variables;
    private Spinner spinner;
    private EditText edit;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        // Aqui  yo llamo los elementos por id
        spinner = (Spinner) findViewById(R.id.spn1);
        edit = (EditText) findViewById(R.id.edite3);
        text = (TextView) findViewById(R.id.tve);

        String[] Cliente = {"Mario", "Constanza", "Fernanda"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Cliente);
        spinner.setAdapter(adapt);
    }

    public void Calcula(View v) {
        if (spinner.getSelectedItem().toString().equals("Mario") && edit.getText().toString().equals("Horno")) {
            int Op = 500000 - 45000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :" + resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Mario")&& edit.getText().toString().equals("Espejo")) {
            int Op = 500000 - 100000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :" + resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Mario")&& edit.getText().toString().equals("Sillas")) {
            int Op = 500000- 80000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
    }
        else if (spinner.getSelectedItem().toString().equals("Constanza")&& edit.getText().toString().equals("Horno")) {
            int Op = 450000- 320000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Constanza")&& edit.getText().toString().equals("Espejo")) {
            int Op = 320000- 100000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Constanza")&& edit.getText().toString().equals("Sillas")) {
            int Op = 320000 - 80000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Fernanda")&& edit.getText().toString().equals("Horno")) {
            int Op = 120000- 45000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Fernanda")&& edit.getText().toString().equals("Espejo")) {
            int Op = 120000- 100000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else if (spinner.getSelectedItem().toString().equals("Fernanda")&& edit.getText().toString().equals("Sillas")) {
            int Op = 120000- 80000;
            String resultado = String.valueOf(Op);
            text.setText("Su deuda es :"+resultado);
        }
        else{

            text.setText("Ingrese producto correctamente");
        }
    }
}