package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    Button btnIMC;
    Button btnTEMP;
    Button btnCALC;

    EditText Nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button btnIMC = (Button) findViewById(R.id.btnIMC);
        Button btnTEMP = (Button) findViewById(R.id.btnTemp);
        Nom = (EditText) findViewById(R.id.txtUser);
        final TextView NomU = (TextView) findViewById(R.id.txtRes2);
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = new String(Nom.getText().toString());
                NomU.setText(""+nom);

                Intent i = new Intent(Inicio.this, IMC.class);
                i.putExtra("Usu", NomU.getText().toString());
                startActivity(i);
            }
        });

        btnTEMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }









}