package com.gustavozen1.calculodeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void btCalculoOnClick(View view){


            TextView resultado = (TextView) findViewById(R.id.resultado);
            EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
            EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

            double peso     = Double.parseDouble(txtPeso.getText().toString());
            double altura   = Double.parseDouble(txtAltura.getText().toString());



            double imc = peso / (altura * altura);
                resultado.setText(String.valueOf(imc));

            if (imc <= 18.5) {
                resultado.setText("Você está abaixo do peso.");
            } else if (imc > 18.5 && imc < 24.9) {
                resultado.setText("Você está com um peso normal.");
            } else if (imc >= 24.9 && imc <29.5){
                resultado.setText("Você está com um peso acima da média.");
            } else{
                resultado.setText("Você está com obesidade.");
            }
        }

}