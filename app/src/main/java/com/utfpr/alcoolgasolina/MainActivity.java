package com.utfpr.alcoolgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular (View view){
        TextView texto  = findViewById(R.id.result);

        EditText texto_alcool = findViewById((R.id.precoalcool));
        EditText texto_gasolina = findViewById((R.id.precogasolina));

       double precoalcool = Double.parseDouble(String.valueOf(texto_alcool.getText()));
       double precogasolina = Double.parseDouble(String.valueOf(texto_gasolina.getText()));

        if (precoalcool < (precogasolina * 0.7)){
            texto.setText("álcool");
        } else {
            texto.setText("gasolina");
        }
    }
}