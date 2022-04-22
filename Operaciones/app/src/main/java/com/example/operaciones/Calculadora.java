package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        tvResultado = findViewById(R.id.txtResultado);
        TextView nom = (TextView) findViewById(R.id.txtNombre2);
        String Nombre = getIntent().getStringExtra("Usu");
        nom.setText(Nombre);

    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        float valor  = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }
    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }


    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirOne(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if (valor == 0.0f){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }
    public void LimpiarResultado(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "÷";
        tvResultado.setText("0");
    }
    public void OperaionMultiplicaión(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "×";
        tvResultado.setText("0");
    }

    public void OperaionResta(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");
    }

    public void OperaionSuma(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");
    }
    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        if (operacion.equals("÷")){
            if (numero2 == 0.0f){
                tvResultado.setText("0");
                Toast.makeText(this,"OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 / numero2;
                tvResultado.setText(result + "");
            }
        }else if(operacion.equals("×")){
            float result = numero1 * numero2;
            int b = (int)Math.round(result);
            tvResultado.setText(""+ b);
        }else if(operacion.equals("+")){
            float result = numero1 + numero2;
            int b = (int)Math.round(result);
            tvResultado.setText(""+ b);
        }else if(operacion.equals("-")){
            float result = numero1 - numero2;
            int b = (int)Math.round(result);
            tvResultado.setText(""+ b);
        }
         numero1 = 0.0f;
         numero2 = 0.0f;
         operacion = "";
    }
}