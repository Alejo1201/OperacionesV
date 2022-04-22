package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMC extends AppCompatActivity {


    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        n1 = (EditText) findViewById(R.id.txtAltura);
        n2 = (EditText) findViewById(R.id.txtPeso);
        Button imc = (Button) findViewById(R.id.btnCalcular);
        TextView nom = (TextView) findViewById(R.id.txtNombre3);
        final TextView res = (TextView) findViewById(R.id.txtRes);
        String Nombre = getIntent().getStringExtra("Usu");

        nom.setText(""+Nombre);
        imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText(""+ (num2/(num1+num1)));



                Intent i = new Intent(IMC.this, ResultadoIMC.class);
                i.putExtra("imcR", res.getText().toString());
                i.putExtra("Usuario", Nombre);
                startActivity(i);

            }
        });


    }
}