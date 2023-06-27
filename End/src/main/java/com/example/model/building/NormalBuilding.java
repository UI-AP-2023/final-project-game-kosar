package com.example.model.building;

import javafx.scene.image.ImageView;

import java.io.File;

public class NormalBuilding extends Building {

    public NormalBuilding(Location location) {
        super(location);
        setDefensive(false);
        setHealth(50);
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Building1.jpg")
                .toURI().toString()));
    }

    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }
}
