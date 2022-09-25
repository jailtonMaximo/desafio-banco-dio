package com.example.bancodio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bancodio.adppter.AdpClietes;
import com.example.bancodio.entidade.Banco;
import com.example.bancodio.entidade.Cliente;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ActClientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_clientes);
        FloatingActionButton fbAddCliente = findViewById(R.id.act_clientes_add);
        RecyclerView rcClientes = findViewById(R.id.act_clientes_lista);
        rcClientes.setLayoutManager(new LinearLayoutManager(this));

        AdpClietes adapter = new AdpClietes(this);
        rcClientes.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcClientes.setLayoutManager(linearLayoutManager);

        fbAddCliente.setOnClickListener(view -> {
            Banco.cliente.add(new Cliente(1,"Jailton"));
            Banco.cliente.add(new Cliente(2,"Fernando"));
            Banco.cliente.add(new Cliente(3,"Carine"));
            Banco.cliente.add(new Cliente(4,"Paulo"));
            Banco.cliente.add(new Cliente(5,"Bruno"));
            Banco.cliente.add(new Cliente(6,"Douglas"));
            adapter.atualizarLista(Banco.cliente);

        });

    }




}