package com.example.model.hero;

import com.example.model.building.Location;
import javafx.scene.image.ImageView;

import java.io.File;

public class RedPishi extends Hero{
    public RedPishi(Location location) {
        super(location);
        setName("Red Pishi");
        setHealth(12);
        setPower(2);
        setTimeBetween(1500);
        //////////////////////////////////////////////setSpeed();
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\RedPishi.png")
                .toURI().toString()));
    }
}
