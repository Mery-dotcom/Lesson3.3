package com.geeks.lesson33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.lesson33.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment implements onItemClick {

    private FragmentCountryBinding binding;
    private int position;
    CountryAdapter adapter = new CountryAdapter(this);
    ContinentAdapter continentAdapter = new ContinentAdapter(this);
    private ArrayList<Country> countries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvCountry.setAdapter(adapter);
        position = getArguments().getInt("cont");
        switch (position) {
            case 0:
                loadAsia();
                break;
            case 1:
                loadAmerica();
                break;
            case 2:
                loadAustralia();
                break;
            case 3:
                loadEurope();
                break;
            case 4:
                loadAfrica();
                break;
        }
        adapter.loadData(countries);

    }

    private void loadAmerica() {
        ArrayList<Continent> listArgentina = new ArrayList<>();
        listArgentina.add(new Continent("Buenos Aires", "https://cdn.tripster.ru/thumbs2/732b95e8-e8e6-11ee-b1b1-befc76184d1e.1220x600.jpeg"));
        listArgentina.add(new Continent("Mendoza", "https://www.quinta.ru/upload/iblock/062/w3vfycqqb34981bfrdz38a1pknp101r9/Argentina%20Mendoza.jpg"));
        listArgentina.add(new Continent("San Miguel de Tucumán", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_S0SEdYuDMGkEaghY12Qc7YEVRssINSNorg&s"));


        ArrayList<Continent> listBolivia = new ArrayList<>();
        listBolivia.add(new Continent("Santa Cruz", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5QSDxnS2WN00cyOnOr4T7pnVDrFLpXmUL-g&s"));
        listBolivia.add(new Continent("La Pas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRuGkUyqxhmVA4XlKE7B3CPpK3rQME5A9vrA&s"));
        listBolivia.add(new Continent("Oruro", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/04/20/82/87/carnaval-de-oruro.jpg?w=1000&h=1000&s=1"));

        ArrayList<Continent> listChile = new ArrayList<>();
        listChile.add(new Continent("Santiago", "https://img.pac.ru/resorts/213108/247551/big/9248FFDD7F000101767DD0F9E7D36199.jpg"));
        listChile.add(new Continent("Valparaíso", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/15/33/fc/b7/valparaiso.jpg?w=1200&h=700&s=1"));
        listChile.add(new Continent("Antofagasta", "https://lh3.googleusercontent.com/proxy/2QNN2PhdSn-YZrvnehbkmJb9rRDxTfRJnNJt3QTYRIqtAJDYHKvjE9PyNF40kACfwMMn85BYfSKrwBE9WrRAgXCe41M3saSYV5cMDvx3-4QeKenLpWTEwsILt5POvCu_MWbMCJGGWxf5pgkU6iD7cADsXgNt_Q"));

        countries.add(new Country("Argentina", "https://m.media-amazon.com/images/I/61H5FszKQvL._AC_UF1000,1000_QL80_.jpg", listArgentina));
        countries.add(new Country("Bolivia", "https://cdn.britannica.com/54/6754-050-897FBD93/Flag-Bolivia.jpg", listBolivia));
        countries.add(new Country("Chile", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz3KlVNpuGO8tTjpAAolF2iDUk6wWf2o41PQ&s", listChile));

    }

    private void loadAustralia() {
        ArrayList<Continent> listAustralia = new ArrayList<>();
        listAustralia.add(new Continent("Melbourne", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGlLatM-kX9UbyHJhNviWksLYvw0Cto7QiaQ&s"));
        listAustralia.add(new Continent("Sydney", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCr4RPaMlmiMMYaThlff5QBMMcaZyN20UVqw&s"));
        listAustralia.add(new Continent("Brisbane", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnUA5WOXL8jhq2CqztKeSCuBmNp4bqTXGDDg&s"));


//        ArrayList<Continent> listUzbekistan = new ArrayList<>();
//        listUzbekistan.add(new Continent("Tashkent", ""));
//        listUzbekistan.add(new Continent("Buhara", ""));
//        listUzbekistan.add(new Continent("Samarkand", ""));
//
//        ArrayList<Continent> listKazahstan = new ArrayList<>();
//        listKazahstan.add(new Continent("Almaty", ""));
//        listKazahstan.add(new Continent("Astana", ""));
//        listKazahstan.add(new Continent("Aktau", ""));

        countries.add(new Country("Australia", "https://m.media-amazon.com/images/I/71nN-nDOObL._AC_UF894,1000_QL80_.jpg", listAustralia));
//        countries.add(new Country("Uzbekistan", "https://cdn.britannica.com/47/7247-050-BEEDE5E3/Flag-Uzbekistan.jpg", listUzbekistan));
//        countries.add(new Country("Kazahstan", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW1-NHqDoJEboA_0szgxy2YC-CxyDF-TWa6A&s", listKazahstan));

    }

    private void loadEurope() {
        ArrayList<Continent> listLondon= new ArrayList<>();
        listLondon.add(new Continent("Edinburgh", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKb0HwUN5WiMqst4BFf2UUtSwTBqLhQzeOyw&s"));
        listLondon.add(new Continent("Islington", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJblurE_n1Zsna0j4kcQEdBExXDxRFhbNqoQ&s"));
        listLondon.add(new Continent("Westminster", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7Plnenpqc4CfPT3XJXP_uR5vchqs_sRITeA&s"));


        ArrayList<Continent> listFrance = new ArrayList<>();
        listFrance.add(new Continent("Paris", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa-r1pumJa63YkTyjpb3rD6t87RHwsLptKvw&s"));
        listFrance.add(new Continent("Lyon", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/14/da/01/47/vieux-lyon.jpg?w=900&h=500&s=1"));
        listFrance.add(new Continent("Marseille", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA2kSUiOdE9CTTWyPOR0OL2txQVSqXuDwUFw&s"));

        ArrayList<Continent> listGermany = new ArrayList<>();
        listFrance.add(new Continent("Berlin", "https://cdn.tripster.ru/thumbs2/f71ccace-24b5-11ef-b401-7ac89597210f.1220x600.jpeg"));
        listFrance.add(new Continent("Hamburg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS78PMLZG0Z2sAzjTw2HLw9eRVjsF6GAS-c6A&s"));
        listFrance.add(new Continent("Köln", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0eV-Iz9wuiKwCMvhvaWNvq4yeRNdsK1ngYw&s"));

        countries.add(new Country("London", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWnI_EHW3_TlJHyz_r2m5Me4O57cvxXAyvWg&s", listLondon));
        countries.add(new Country("France", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_nAGd8GRzURpcSX3BIF41_CyTYQEBJWwJpQ&s", listFrance));
        countries.add(new Country("Germany", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtzkF0xictbmeJ7OmTD5KQdaP1mts2r4z2Jw&s", listGermany));

    }


    private void loadAfrica() {
        ArrayList<Continent> listAlgeria = new ArrayList<>();
        listAlgeria.add(new Continent("Algiers", "https://cms.enjourney.ru/upload/Jana/Algeria/Algiers/Al6.jpg"));
        listAlgeria.add(new Continent("Oran", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7SPsvuXNGSHceCZ-djsaHKB6sbedVfA1IIw&s"));
        listAlgeria.add(new Continent("Constantine", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSs1062YQOMNnoWLCM1UINi9RFs1JnWxU-cug&s"));


        ArrayList<Continent> listAngola = new ArrayList<>();
        listAngola.add(new Continent("Luanda", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1lS3TO5oLUYvMmX0uRUlNhbetN8D8txZ4Cw&s"));
        listAngola.add(new Continent("Huambo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6q0a4PLVjK7Oo7_Q6WHVE2n6YbVy5VqSssA&s"));
        listAngola.add(new Continent("Benguela", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6lcR7UHxwh1dxNyZn-uMVSIY71PV9ydu4Q&s"));

        ArrayList<Continent> listBotswana = new ArrayList<>();
        listBotswana.add(new Continent("Gaborone", "https://eurokurort.by/images/fotobank/nation/145/21314_big.jpg"));
        listBotswana.add(new Continent("Francistown", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvAJ2QHJgPr4BZGxx78MJLoHMNIKXYONUcgw&s"));
        listBotswana.add(new Continent("Maun", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0OfTGkwKDNY_TRfK2GyyZ3rwKc9K9hOVK_Q&s"));

        countries.add(new Country("Algeria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqpwWCHK7mNqGqRa8mIRt0egTb1fKy0I7z0A&s", listAlgeria));
        countries.add(new Country("Angola", "https://cdn.britannica.com/47/7247-050-BEEDE5E3/Flag-Uzbekistan.jpg", listAngola));
        countries.add(new Country("Botswana", "https://cdn11.bigcommerce.com/s-hhbbk/products/181/images/35976/BOTS0001__06068.1580483000.500.750.png?c=2", listBotswana));

    }

    private void loadAsia() {
        ArrayList<Continent> listKyrgyzstan = new ArrayList<>();
        listKyrgyzstan.add(new Continent("Bishkek", ""));
        listKyrgyzstan.add(new Continent("Osh", ""));
        listKyrgyzstan.add(new Continent("Naryn", ""));


        ArrayList<Continent> listUzbekistan = new ArrayList<>();
        listUzbekistan.add(new Continent("Tashkent", ""));
        listUzbekistan.add(new Continent("Buhara", ""));
        listUzbekistan.add(new Continent("Samarkand", ""));

        ArrayList<Continent> listKazahstan = new ArrayList<>();
        listKazahstan.add(new Continent("Almaty", ""));
        listKazahstan.add(new Continent("Astana", ""));
        listKazahstan.add(new Continent("Aktau", ""));

        countries.add(new Country("Kyrgyzstan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/640px-Flag_of_Kyrgyzstan.svg.png", listKyrgyzstan));
        countries.add(new Country("Uzbekistan", "https://cdn.britannica.com/47/7247-050-BEEDE5E3/Flag-Uzbekistan.jpg", listUzbekistan));
        countries.add(new Country("Kazahstan", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW1-NHqDoJEboA_0szgxy2YC-CxyDF-TWa6A&s", listKazahstan));
    }

    @Override
    public void onClick(int position) {
        binding.rvCountry.setVisibility(View.GONE);
        binding.rvCities.setVisibility(View.VISIBLE);
        binding.rvCities.setAdapter(continentAdapter);
        continentAdapter.loadData(countries.get(position).getCities());
     }
}