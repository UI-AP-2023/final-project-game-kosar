package com.example.model.map;

import com.example.model.building.*;

import java.util.ArrayList;

public class MapA extends Map {
    public MapA(){
        Location location = new Location(250 , 200 , 350 , 300);
        MainBuilding mainBuilding = new MainBuilding(location);

        location = new Location(250 , 150 , 300 , 200);
        NormalBuilding normalBuilding1 = new NormalBuilding(location);

        location = new Location(350 , 200 , 400 , 250 );
        NormalBuilding normalBuilding2 = new NormalBuilding(location);

        location = new Location(200 , 250 , 250 , 300);
        NormalBuilding normalBuilding3 = new NormalBuilding(location);

        location = new Location(300 , 300 , 350 , 350);
        NormalBuilding normalBuilding4 = new NormalBuilding(location);

        location = new Location(300 , 150 , 350 , 200);
        ArcherBuilding archerBuilding1 = new ArcherBuilding(location);

        location = new Location(250 , 300 , 300 , 350);
        ArcherBuilding archerBuilding2 = new ArcherBuilding(location);

        location = new Location(200 , 200 , 250 , 250 );
        BombBuilding bombBuilding1 = new BombBuilding(location);

        location = new Location(350 , 250 , 400 , 300);
        BombBuilding bombBuilding2 = new BombBuilding(location);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(mainBuilding);

        buildings.add(normalBuilding1);
        buildings.add(normalBuilding3);

        buildings.add(normalBuilding2);
        buildings.add(normalBuilding4);
        buildings.add(bombBuilding2);
        buildings.add(bombBuilding1);
        buildings.add(archerBuilding1);
        buildings.add(archerBuilding2);




        setBuildings(buildings);
        setName("A");
        setNumberOfHero(15);
    }
}
