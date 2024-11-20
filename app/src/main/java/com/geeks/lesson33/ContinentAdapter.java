package com.geeks.lesson33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.lesson33.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ItemContinentBinding binding;
    private ArrayList<Continent> list;
    onItemClick onItemClick;

    public ContinentAdapter( com.geeks.lesson33.onItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public void loadData(ArrayList<Continent> listContinent){
        list = listContinent;
    }


    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ContinentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
