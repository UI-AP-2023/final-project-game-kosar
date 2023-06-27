package com.example.model.map;

import com.example.model.building.*;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SecondMap extends Map implements Initializable {
    SecondMap(String name) {
        super("Nini");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Location location = new Location(150, 150, 250, 250);
        MainBuilding mainBuilding = new MainBuilding(location);

        location = new Location(150, 100, 200, 150);
        ArcherBuilding archerBuilding1 = new ArcherBuilding(location);

        location = new Location(250, 100, 300, 150);
        ArcherBuilding archerBuilding2 = new ArcherBuilding(location);

        location = new Location(100, 250, 150, 300);
        ArcherBuilding archerBuilding3 = new ArcherBuilding(location);

        location = new Location(200, 250, 250, 300);
        ArcherBuilding archerBuilding4 = new ArcherBuilding(location);

        location = new Location(200, 100, 250, 150);
        NormalBuilding normalBuilding1 = new NormalBuilding(location);

        location = new Location(250, 150, 300, 200);
        NormalBuilding normalBuilding2 = new NormalBuilding(location);

        location = new Location(100, 200, 150, 250);
        NormalBuilding normalBuilding3 = new NormalBuilding(location);

        location = new Location(150, 250, 200, 300);
        NormalBuilding normalBuilding4 = new NormalBuilding(location);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(mainBuilding);

        buildings.add(archerBuilding1);
        buildings.add(archerBuilding2);
        buildings.add(archerBuilding3);
        buildings.add(archerBuilding4);

        buildings.add(normalBuilding1);
        buildings.add(normalBuilding2);
        buildings.add(normalBuilding3);
        buildings.add(normalBuilding4);

        setBuildings(buildings);
    }
}
