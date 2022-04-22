package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {

    Button convertir = null;
    EditText cantidad = null;
    TextView resultado = null;
    Spinner spincl = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        convertir = (Button) findViewById(R.id.btnTemp);
        cantidad = (EditText) findViewById(R.id.txtTempe);
        resultado = (TextView) findViewById(R.id.Resu);
        spincl = (Spinner) findViewById(R.id.spinla);
        Button btnINICIO = (Button) findViewById(R.id.btnInicio2);
        TextView nom = (TextView) findViewById(R.id.txtNombre);
        String Nombre = getIntent().getStringExtra("Usu");
        nom.setText(""+Nombre);

        String[] op = {"Seleccione una opción", "°C","°F","°K"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,op);
        spincl.setAdapter(adapter);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cantidad.getText().equals("")){
                    Toast MSJ= Toast.makeText(getApplicationContext(),"Escriba una cantidad por favor",Toast.LENGTH_LONG);
                    MSJ.show();
                }else{
                    Double c = Double.parseDouble(cantidad.getText().toString());
                    Double res1 = null;
                    Double res2 = null;
                    int select = spincl.getSelectedItemPosition();

                    switch (select){

                        case 0:
                            res1=0.0;
                            Toast.makeText(Temperatura.this, "Seleccione una Opción", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            res1=c * 1.8 + 32;
                            res2=c + 273.15;
                            resultado.setText("Grados Fahrenheit:  "+res1+"\n"+
                                    "Grados Kelvin:  "+res2);
                            break;
                        case 2:
                            res1=(c - 32)/1.8;
                            res2=(c - 32)*5/9+273.15;
                            resultado.setText("Grados Celcius:  "+res1+"\n"+
                                    "Grados Kelvin: "+res2);
                            break;
                        case 3:
                            res1=c-273.15;
                            res2=(1.8*(c-273.15)+32);
                            resultado.setText("Grados Celcius:  "+res1+"\n"+
                                    "Grados Fahrenheit:  "+res2);
                            break;

                    }
                }
            }
        });

        btnINICIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Temperatura.this, Inicio.class);
                startActivity(i);
            }
        });


    }
}