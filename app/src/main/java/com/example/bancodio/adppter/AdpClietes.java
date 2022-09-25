package com.example.bancodio.adppter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bancodio.R;
import com.example.bancodio.entidade.Cliente;
import com.example.bancodio.viewholder.ClienteViewHolder;
import java.util.ArrayList;

public class AdpClietes extends RecyclerView.Adapter{
    private final ArrayList<Cliente> clientes = new ArrayList<>();
    private final Context context;

    public AdpClietes(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.adp_cliente, parent, false);
        return new ClienteViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Cliente cliente = clientes.get(position);
        ClienteViewHolder clienteViewHolder = (ClienteViewHolder) holder;
        clienteViewHolder.setTvId(String.valueOf(cliente.getId()));
        clienteViewHolder.setTvNome(cliente.getNome());
    }

    @Override
    public int getItemCount() {
        return clientes.size();
    }

    public void atualizarLista(ArrayList<Cliente> lista) {
        clientes.clear();
        clientes.addAll(lista);
        notifyDataSetChanged();
    }
}
