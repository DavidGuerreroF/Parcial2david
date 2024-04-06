package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText id;
    private EditText gmail;
    private EditText nu;

    private String Leng;
    private String Cont;

    private String Ing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = findViewById(R.id.nombre);
        gmail = findViewById(R.id.correo);
        nu = findViewById(R.id.telefono);
    }

    public void Ingles(View view) {
        System.out.println("recibo de pago\n$4000000 ");
        System.out.println(""+(id) + (gmail) + (nu)+"");
        mostrarResultado(Leng);
    }

    public void Contabilidad(View view) {
        System.out.println("recibo de pago\n$3000000 ");
        System.out.println(""+(id) + (gmail) + (nu)+"");
        mostrarResultado(Cont);
    }

    public void Sistemas(View view) {
        System.out.println("recibo de pago\n$7000000 ");
        System.out.println(""+(id) + (gmail) + (nu)+"");
        mostrarResultado(Ing);
    }
    private void mostrarResultado(String resultado) {
        Intent intent = new Intent(this, Resultactivity.class);
        intent.putExtra("Bienvenido a la UNIAGUSTINIANA", resultado);
        startActivity(intent);
    }
}