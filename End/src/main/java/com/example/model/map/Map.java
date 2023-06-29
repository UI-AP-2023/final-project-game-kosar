package com.example.model.map;

import com.example.model.building.Building;

import java.util.ArrayList;

public class Map {
    private int numberOfHero;
    private String name;

    public int getNumberOfHero() {
        return numberOfHero;
    }

    public void setNumberOfHero(int numberOfHero) {
        this.numberOfHero = numberOfHero;
    }

    private ArrayList<Building> buildings = new ArrayList<>();

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}