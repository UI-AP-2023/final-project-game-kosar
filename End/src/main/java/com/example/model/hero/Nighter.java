package com.example.model.hero;

import com.example.model.building.Location;
import javafx.scene.image.ImageView;

import java.io.File;

public class Nighter extends Hero {

    public Nighter(Location location) {
        super(location);
        setName("Knight Hing");
        setHealth(10);
        setPower(4);
        setTimeBetween(1500);
        //////////////////////////////////////////////setSpeed();
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\1_knight_.png")
                .toURI().toString()));
    }
}
