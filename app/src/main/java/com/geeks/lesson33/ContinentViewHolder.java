package com.geeks.lesson33;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.lesson33.databinding.ItemContinentBinding;


public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;


    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Continent continent) {
        binding.tvContinentName.setText(continent.getName());
        Glide
                .with(binding.ivContinent)
                .load(continent.getImage())
                .centerCrop()
                .into(binding.ivContinent);
    }
}
