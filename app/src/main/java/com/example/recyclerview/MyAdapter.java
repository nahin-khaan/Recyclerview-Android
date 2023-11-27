package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] DES,TIT;
    int[] PIC;

    public MyAdapter(Context context, String[] title, String[] descr, int[] flag) {
        this.context=context;
        this.TIT=title;
        this.DES=descr;
        this.PIC=flag;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.sample_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.tiText.setText(TIT[position]);
        holder.deText.setText(DES[position]);
        holder.img.setImageResource(PIC[position]);
    }

    @Override
    public int getItemCount()

    {

        return TIT.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tiText,deText;
        ImageView img;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tiText=itemView.findViewById(R.id.tittleTextViewId);
            deText=itemView.findViewById(R.id.descTextViewId);
            img=itemView.findViewById(R.id.imageId);
        }
    }

    ;
}
