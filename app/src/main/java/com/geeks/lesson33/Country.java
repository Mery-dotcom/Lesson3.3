package com.geeks.lesson33;

import java.util.ArrayList;

public class Country {
    private String name;
    private String image;
    private ArrayList<Continent> cities;

    public Country(String name, String image, ArrayList<Continent> cities) {
        this.name = name;
        this.image = image;
        this.cities = cities;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Continent> getCities() {
        return cities;
    }
}
