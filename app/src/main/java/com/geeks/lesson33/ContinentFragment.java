package com.geeks.lesson33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.lesson33.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements onItemClick {
    private FragmentSecondBinding binding;
    private ArrayList<Continent> continents = new ArrayList<>();
    ContinentAdapter adapter = new ContinentAdapter(this);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initAdapter();
    }

    private void loadData() {
        continents.add(new Continent("Asia", "https://img.freepik.com/free-vector/flat-asia-map-infographic_23-2148753291.jpg?t=st=1732107174~exp=1732110774~hmac=6ff71c99e58391e034bb0c99a4d27ed744fc2bf564201744897e7a44fdb76a98&w=2000"));
        continents.add(new Continent("America", "https://c8.alamy.com/comp/E848FW/united-states-of-america-political-map-E848FW.jpg"));
        continents.add(new Continent("Australia", "https://www.mappr.co/wp-content/uploads/2024/01/australia-states-map.jpg"));
        continents.add(new Continent("Europe", "https://european-union.europa.eu/sites/default/files/styles/embed_large_2x/public/2024-05/european-map_en.jpg?itok=PCimTmkU"));
        continents.add(new Continent("Africa", "https://media.istockphoto.com/id/587892720/vector/africa-single-states-political-map.jpg?s=612x612&w=0&k=20&c=kQj9qra1FOcR_G1M18xetRg9idG6cL9dH4UP1k-s5uw="));
        adapter.loadData(continents);
    }

    private void initAdapter() {
        binding.rvContinents.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                bundle.putInt("cont", 0);
                break;
            case 1:
                bundle.putInt("cont", 1);
                break;
            case 2:
                bundle.putInt("cont", 2);
                break;
            case 3:
                bundle.putInt("cont", 3);
                break;
            case 4:
                bundle.putInt("cont", 4);
                break;
        }
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, countryFragment).addToBackStack(null).commit();
    }
}