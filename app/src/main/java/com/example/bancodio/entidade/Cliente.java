package com.example.bancodio.entidade;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private ArrayList<Conta> contas;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
