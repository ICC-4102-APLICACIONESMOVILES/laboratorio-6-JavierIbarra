package com.example.jaiba.laboratorio;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaiba on 08-04-2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> implements View.OnClickListener{

    List<Form> ListForms;
    private View.OnClickListener listener;

    public AdapterDatos(List<Form> listaDatos) {
        this.ListForms = listaDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);

        view.setOnClickListener(this);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.name1.setText(ListForms.get(position).getName());
        holder.date1.setText(ListForms.get(position).getDate());
        //holder.category1.setText(ListForms.get(position).getCategory());
        holder.commentary1.setText(ListForms.get(position).getCommentary());
    }

    @Override
    public int getItemCount() {
        return ListForms.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;

    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView name1;
        TextView date1;
        TextView commentary1;


        public ViewHolderDatos(View itemView) {
            super(itemView);
            name1 = itemView.findViewById(R.id.name);
            date1 = itemView.findViewById(R.id.date);
            commentary1 = itemView.findViewById(R.id.commentary);
        }

    }
}
