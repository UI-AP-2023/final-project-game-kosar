package com.example.controller;

import com.example.model.building.*;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MapB extends Map implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Location location = new Location(250 , 160 , 350 , 260);
        MainBuilding mainBuilding = new MainBuilding(location);

        location = new Location(200 , 210 , 250 , 260 );
        NormalBuilding normalBuilding1 = new NormalBuilding(location);

        location = new Location(350 , 210 , 400 , 260);
        NormalBuilding normalBuilding2 = new NormalBuilding(location);

        location = new Location(250 , 260 , 300 , 310);
        NormalBuilding normalBuilding3 = new NormalBuilding(location);

        location = new Location(300 , 260 , 350 , 310);
        NormalBuilding normalBuilding4 = new NormalBuilding(location);

        location = new Location(200 , 160 , 250  , 210);
        ArcherBuilding archerBuilding1 = new ArcherBuilding(location);

        location = new Location(350 , 160 , 410 , 210 );
        ArcherBuilding archerBuilding2 = new ArcherBuilding(location);

        location = new Location(200 , 260 , 250 , 310);
        BombBuilding bombBuilding1 = new BombBuilding(location);

        location = new Location(350 , 260 , 410 ,310);
        BombBuilding bombBuilding2 = new BombBuilding(location);
        ArrayList <Building>buildings = new ArrayList<>();
        buildings.add(mainBuilding);

        buildings.add(normalBuilding1);
        buildings.add(normalBuilding2);
        buildings.add(normalBuilding3);
        buildings.add(normalBuilding4);

        buildings.add(archerBuilding1);
        buildings.add(archerBuilding2);

        buildings.add(bombBuilding1);
        buildings.add(bombBuilding2);

        setBuildings(buildings);
        setName("B");
    }
}
