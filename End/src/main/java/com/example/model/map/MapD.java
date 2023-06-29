package com.example.model.map;

import com.example.model.building.*;

import java.util.ArrayList;

public class MapD extends Map {
    public MapD() {
        Location location = new Location(200, 175, 300, 275);
        MainBuilding mainBuilding = new MainBuilding(location);

        location = new Location(250, 275, 300, 325);
        NormalBuilding normalBuilding1 = new NormalBuilding(location);

        location = new Location(300, 275, 350, 325);
        NormalBuilding normalBuilding2 = new NormalBuilding(location);

        location = new Location(275, 325, 325, 375);
        NormalBuilding normalBuilding3 = new NormalBuilding(location);

        location = new Location(200, 225, 250, 275);
        ArcherBuilding archerBuilding1 = new ArcherBuilding(location);

        location = new Location(350, 225, 400, 275);
        ArcherBuilding archerBuilding2 = new ArcherBuilding(location);

        location = new Location(225, 325, 275, 375);
        BombBuilding bombBuilding1 = new BombBuilding(location);

        location = new Location(325, 325, 375, 375);
        BombBuilding bombBuilding2 = new BombBuilding(location);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(mainBuilding);

        buildings.add(normalBuilding1);
        buildings.add(normalBuilding2);
        buildings.add(normalBuilding3);

        buildings.add(archerBuilding1);
        buildings.add(archerBuilding2);

        buildings.add(bombBuilding1);
        buildings.add(bombBuilding2);

        setBuildings(buildings);
        setName("D");
        setNumberOfHero(17);

    }
}
