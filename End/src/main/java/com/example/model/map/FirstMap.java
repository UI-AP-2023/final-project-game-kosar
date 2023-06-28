package com.example.model.map;

import com.example.model.building.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FirstMap extends Map implements Initializable {
    FirstMap(String name) {
        super("Pishi");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Location location = new Location(150 , 150 , 250 , 250);
        MainBuilding mainBuilding = new MainBuilding(location);

        location = new Location(150 , 100 , 200 , 150 );
        NormalBuilding normalBuilding1 = new NormalBuilding(location);

        location = new Location(250 , 150 , 300 , 200);
        NormalBuilding normalBuilding2 = new NormalBuilding(location);

        location = new Location(100 , 200 , 150 , 250 );
        NormalBuilding normalBuilding3 = new NormalBuilding(location);

        location = new Location(200 , 250 , 250 , 300);
        NormalBuilding normalBuilding4 = new NormalBuilding(location);

        location = new Location( 200 , 100 , 250 , 150 );
        ArcherBuilding archerBuilding1 = new ArcherBuilding(location);

        location = new Location(150 , 250 , 200 , 300);
        ArcherBuilding archerBuilding2 = new ArcherBuilding(location);

        location = new Location(100 , 150 , 150 , 200);
        BombBuilding bombBuilding1 = new BombBuilding(location);

        location = new Location(250 , 200 , 300 , 250);
        BombBuilding bombBuilding2 = new BombBuilding(location);

        ArrayList<Building>buildings = new ArrayList<>();
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
    }

}
