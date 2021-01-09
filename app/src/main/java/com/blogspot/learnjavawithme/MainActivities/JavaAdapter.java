package com.blogspot.learnjavawithme.MainActivities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.learnjavawithme.R;

import java.util.ArrayList;

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.ViewHolder> {
   Context context;
   ArrayList<JavaModel> list;
   RecycleViewClickListener recycleViewClickListener;

    public JavaAdapter(Context context, ArrayList<JavaModel> list, RecycleViewClickListener recycleViewClickListener) {
        this.context = context;
        this.list = list;
        this.recycleViewClickListener = recycleViewClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.costume_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.showText.setText(list.get(position).displayText);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView showText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            showText  = itemView.findViewById(R.id.showText);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recycleViewClickListener.OnItemClick(getAdapterPosition());
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    recycleViewClickListener.OnLongItemClick(getAdapterPosition());
                    return true;
                }
            });
        }
    }
}
