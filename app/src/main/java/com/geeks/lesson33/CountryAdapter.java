package com.geeks.lesson33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.lesson33.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ItemContinentBinding binding;
    private ArrayList<Country> list;
    onItemClick onItemClick;

    public CountryAdapter( com.geeks.lesson33.onItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public void loadData(ArrayList<Country> listCountry){
        list = listCountry;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
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
