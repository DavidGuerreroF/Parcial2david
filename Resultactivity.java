package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Resultactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtener el resultado del intent
        int resultado = getIntent().getIntExtra("resultado", 0);

        // Mostrar el resultado en el TextView
        TextView textViewResultado = findViewById(R.id.Resultado);
        textViewResultado.setText("Estas a punto de Inscribirte " + resultado);
    }

    public void volver(View view) {
        finish();
    }
}