package com.geeks.lesson33;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.lesson33.databinding.ItemContinentBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;


    public CountryViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Country continent) {
        binding.tvContinentName.setText(continent.getName());
        Glide
                .with(binding.ivContinent)
                .load(continent.getImage())
                .centerCrop()
                .into(binding.ivContinent);
    }
}
