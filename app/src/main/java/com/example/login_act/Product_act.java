package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Product_act extends AppCompatActivity {
    // Declaraciones de variables
    private EditText edit;
    private EditText edit1;
    private CheckBox check;
    private CheckBox check1;
    private CheckBox check2;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);
        // Aqui voy a llamar los elementos por id

        edit = (EditText) findViewById(R.id.edite);
        edit1 = (EditText) findViewById(R.id.edite1);
        check = (CheckBox) findViewById(R.id.ch);
        check1 = (CheckBox) findViewById(R.id.ch1);
        check2 = (CheckBox) findViewById(R.id.ch2);
        text = (TextView) findViewById(R.id.tv);

    }

    public void Calcular(View v) {
        try {
            String valor = edit1.getText().toString();
            int var = Integer.parseInt(valor);
            if (edit.getText().toString().equals("Televisor")) {
                if (var == 129000 && check.isChecked() == true) {
                    int Operacion = var + 14500;
                    String resultado = String.valueOf(Operacion);
                    text.setText("Su costo por el producto es" + resultado);
                } else {
                    int deuda = var - 129000;
                    String result = String.valueOf(deuda);
                    text.setText("Tienes que pagar su deuda" + deuda);
                }
                if (check1.isChecked() == true) {
                    text.setText(" pago  :" + var + " " + "no se aplica valor del envio adiicional");
                }
                if (check2.isChecked() == true) {
                    text.setText(" pago :" + var + " " + "no se aplica valor del envio adicional");
                }
            }
            if (edit.getText().toString().equals("Microondas")) {
                if (var == 50000 && check.isChecked() == true) {
                    int Operacion = var + 5500;
                    String resultado = String.valueOf(Operacion);
                    text.setText("Su costo por el producto es  " + resultado);
                } else {
                    int deuda = var - 50000;
                    String result = String.valueOf(deuda);
                    text.setText("Tienes que pagar su deuda " + deuda);
                }
                if (check1.isChecked() == true) {
                    text.setText("pago  :" + var + " " + "no se aplica valor del envio adiicional");
                }
                if (check2.isChecked() == true) {
                    text.setText("pago :" + var + " " + "no se aplica valor del envio adicional");
                }
            }
            if (edit.getText().toString().equals("Lavadora")) {
                if (var == 100000 && check.isChecked() == true) {
                    int Operacion = var + 25000;
                    String resultado = String.valueOf(Operacion);
                    text.setText("Su costo por el producto es" + resultado);
                } else {
                    int deuda = var - 100000;
                    String result = String.valueOf(deuda);
                    text.setText("Tienes que pagar su deuda" + deuda);
                }
                if (check1.isChecked() == true) {
                    text.setText(" pago  :" + var + " " + "no se aplica valor del envio adiicional");
                }
                if (check2.isChecked() == true) {
                    text.setText("pago :" + var + " " + "no se aplica valor del envio adicional");
                }
            }
        }catch(Exception e){
            text.setText(e.toString());
            e.printStackTrace();
        }
    }
}
