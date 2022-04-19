package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoIMC extends AppCompatActivity {
    TextView tvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);

        tvDatos = (TextView) findViewById(R.id.txtDato);
        Button btnINICIO = (Button) findViewById(R.id.btnInicio);
        String Nombre = getIntent().getStringExtra("Usuario");
        String dato = getIntent().getStringExtra("imcR");
        float Ri = Float.valueOf(dato);
        if((Ri>=18.5) && (Ri<=24.9)){
        tvDatos.setText(Nombre+"\n"+"Normal:  "+Ri+"\n"+
                " Riesgo: Promedio");
        }else if ((Ri>=25) && (Ri<=29.9)){
        tvDatos.setText(Nombre+"\n"+"Sobrepeso:  "+Ri+"\n"+
                " Riesgo: Aumentado");
        }else if ((Ri>=30) && (Ri<=34.9)){
        tvDatos.setText(Nombre+"\n"+"Obesidad grado 1:  "+Ri+"\n"+
                " Riesgo: Moderado");
        }else if ((Ri>=35) && (Ri<=39.9)){
        tvDatos.setText(Nombre+"\n"+"Obesidad grado 2:  "+Ri+"\n"+
                " Riesgo: Severo");
        }else if (Ri>34) {
        tvDatos.setText(Nombre+"\n"+"Obesidad grado 3:  "+Ri+"\n"+
                " Riesgo: Muy severo");
        }

        btnINICIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResultadoIMC.this, Inicio.class);
                startActivity(i);
            }
        });


    }


}