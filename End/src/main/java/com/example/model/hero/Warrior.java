package com.example.model.hero;

import com.example.model.building.Location;
import com.example.model.building.Middle;
import javafx.scene.image.ImageView;

import java.io.File;

public class Warrior extends Hero {
    public Warrior() {
        setName("Warrior");
        setHealth(15);
        setPower(3);
        setTimeBetween(2000);
        //////////////////////////////////////////////setSpeed();
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\WonderWoman.png")
                .toURI().toString()));
    }
}
