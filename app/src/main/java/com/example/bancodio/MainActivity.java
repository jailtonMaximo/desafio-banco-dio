package com.example.bancodio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DIO");

        Button btListaCliete = findViewById(R.id.activity_main_clientes);
        Button btListaConta = findViewById(R.id.activity_main_contas);
        Button btTransferecia = findViewById(R.id.activity_main_transferencia);
        Button btDeposito = findViewById(R.id.activity_main_deposito);
        Button btSaque = findViewById(R.id.activity_main_saque);

        btListaCliete.setOnClickListener(
            v -> {
                Intent intent = new Intent(this, ActClientes.class);
                startActivity(intent);
            }
        );

        btListaConta.setOnClickListener(
            v -> {
                Intent intent = new Intent(this, ActContas.class);
                startActivity(intent);
            }
        );

        btTransferecia.setOnClickListener(
            v -> {
                Intent intent = new Intent(this, ActTransferencia.class);
                startActivity(intent);
            }
        );

        btDeposito.setOnClickListener(
            v -> {
                Intent intent = new Intent(this, ActDeposito.class);
                startActivity(intent);
            }
        );

        btSaque.setOnClickListener(
            v -> {
                Intent intent = new Intent(this, ActSaque.class);
                startActivity(intent);
            }
        );


    }
}