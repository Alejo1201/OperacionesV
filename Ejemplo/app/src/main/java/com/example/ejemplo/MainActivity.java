package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView Titulo;
    public ImageView ImagenH;
    public TextView TextoL;
    public RatingBar Estrellas;
    public Button Aceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentAtributs();

    }

    private void setContentAtributs(){
        Titulo = findViewById(R.id.textView2);
        ImagenH = findViewById(R.id.imageView2);
        TextoL = findViewById(R.id.textView4);
        Estrellas = findViewById(R.id.ratingBar);
        Aceptar = findViewById(R.id.button3);
    }



}