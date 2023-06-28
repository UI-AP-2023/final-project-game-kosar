package com.example.model.map;


import com.example.model.building.Building;
import javafx.fxml.Initializable;

import java.util.ArrayList;

abstract public class Map implements Initializable {
    private final String name;
    private ArrayList<Building> buildings ;
    Map(String name) {
        this.name = name;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
}
