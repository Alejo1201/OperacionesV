package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    EditText Nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button btnIMC = (Button) findViewById(R.id.btnIMC);
        Button btnTEMP = (Button) findViewById(R.id.btnTemp);
        Button btnCALC = (Button) findViewById(R.id.btnCalcu);

        Nom = (EditText) findViewById(R.id.txtUser);
        final TextView NomU = (TextView) findViewById(R.id.txtRes2);

        btnTEMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = (Nom.getText().toString());
                NomU.setText(""+nom);

                Intent t = new Intent(Inicio.this, Temperatura.class);
                t.putExtra("Usu", NomU.getText().toString());
                startActivity(t);

            }
        });

        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = (Nom.getText().toString());
                NomU.setText(""+nom);

                Intent i = new Intent(Inicio.this, IMC.class);
                i.putExtra("Usu", NomU.getText().toString());
                startActivity(i);
            }
        });

        btnCALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = (Nom.getText().toString());
                NomU.setText(""+nom);

                Intent c = new Intent(Inicio.this, Calculadora.class);
                c.putExtra("Usu", NomU.getText().toString());
                startActivity(c);
            }
        });

    }









}