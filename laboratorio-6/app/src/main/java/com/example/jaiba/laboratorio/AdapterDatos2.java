package com.example.jaiba.laboratorio;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jaiba on 10-04-2018.
 */

public class AdapterDatos2 extends RecyclerView.Adapter<AdapterDatos2.ViewHolderDatos> implements View.OnClickListener {

    List<Question> ListQuestion;
    private View.OnClickListener listener;

    public AdapterDatos2(List<Question> listaDatos) {
        this.ListQuestion = listaDatos;
    }

    @Override
    public AdapterDatos2.ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question,null,false);
        return new AdapterDatos2.ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(AdapterDatos2.ViewHolderDatos holder, int position) {
        holder.question1.setText(ListQuestion.get(position).getTextQuestion());
    }

    @Override
    public int getItemCount() {
        return ListQuestion.size();
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
        TextView question1;


        public ViewHolderDatos(View itemView) {
            super(itemView);
            question1 = itemView.findViewById(R.id.question);
        }

    }
}
