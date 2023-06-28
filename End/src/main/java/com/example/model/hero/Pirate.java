package com.example.model.hero;

import com.example.model.building.Location;
import javafx.scene.image.ImageView;

import java.io.File;

public class Pirate extends Hero{
    public Pirate(Location location) {
        super(location);
        setName("Pirate");
        setHealth(10);
        setPower(2);
        setTimeBetween(1500);
        //////////////////////////////////////////////setSpeed();
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Pirate.png")
                .toURI().toString()));
    }
}
