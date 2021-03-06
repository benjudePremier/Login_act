package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class Commentary_act extends AppCompatActivity {
    // Declaraciones de variables
    private Spinner spinner;
    private ProgressBar progress;
    private RatingBar rating;
    private  int progresso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary_act);

        // Aca yo llamo los elementos por id
        spinner  = (Spinner)findViewById(R.id.spn);
        progress = (ProgressBar)findViewById(R.id.pbr);
        rating   = (RatingBar)findViewById(R.id.rt);


        String [] Productos ={"Televisor", "Refigerador"," Horno","Lavador"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, Productos);
        spinner.setAdapter(adapt);
    }
    public  void Calificar(View v){
            progress.setProgress(3);
            rating.setRating(3);



        Timer t = new Timer();

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                progresso++;
                progress.setProgress(progresso);

            }
        };

        long period = 300;
        long delay = 0;

        t.schedule(tt, delay, period);
    }
}



