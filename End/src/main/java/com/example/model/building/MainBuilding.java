package com.example.model.building;

import javafx.scene.image.ImageView;

import java.io.File;

public class MainBuilding extends Building {
    public MainBuilding(Location location) {
        super(location);
        setDefensive(false);
        setHealth(80);
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Building2.jpg")
                .toURI().toString()));
    }

    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }
}
