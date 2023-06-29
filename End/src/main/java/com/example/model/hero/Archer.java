package com.example.model.hero;

import com.example.model.building.Location;
import javafx.scene.image.ImageView;

import java.io.File;

public class Archer extends Hero implements Shot {
    private int redius;

    public Archer(Location location) {
        super(location);
        setName("Archer");
        setHealth(10);
        setPower(3);
        this.redius = 15;
        setTimeBetween(2000);
        //////////////////////////////////////////////setSpeed();
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Archer.ppg")
                .toURI().toString()));
    }
}
