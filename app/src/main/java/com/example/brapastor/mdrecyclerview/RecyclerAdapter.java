package com.example.brapastor.mdrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by brapastor on 2/08/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String [] myData;
    public RecyclerAdapter(String[] Data){
        myData = Data;
    }

    //CREA LOS NUEVOS ELEMENTO
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }
    //ACTUALIZAR LOS DATOS
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(myData[position]);
    }

    //CONTAR LOS ELEMENTOS
    @Override
    public int getItemCount() {
        return myData.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(View itemView){
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
        }

    }
}
