package com.example.bancodio.viewholder;

import android.view.View;
import android.widget.TextView;
import com.example.bancodio.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClienteViewHolder extends RecyclerView.ViewHolder {
    private TextView tvId;
    private TextView tvNome;



    public ClienteViewHolder(@NonNull View itemView) {
        super(itemView);
        tvId = itemView.findViewById(R.id.adp_cliente_id);
        tvNome = itemView.findViewById(R.id.adp_cliente_nome);


    }

    public void setTvId(String tvId) {
        this.tvId.setText(tvId);
    }

    public void setTvNome(String tvNome) {
        this.tvNome.setText(tvNome);
    }
}
