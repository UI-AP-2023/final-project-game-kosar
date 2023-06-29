package com.example.controller;

import com.example.model.building.Building;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public abstract class Map implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private String name;
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
