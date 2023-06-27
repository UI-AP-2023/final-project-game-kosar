package com.example.model.building;

import javafx.scene.image.ImageView;

import java.io.File;

public class ArcherBuilding extends Building implements defenceDuilding {

    private int attackPower;
    private long speed;///mili second
    public ArcherBuilding(Location location) {
        super(location);
        setDefensive(true);
        setHealth(50);
        attackPower = 3;
        speed = 2000;
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Building3.jpg")
                .toURI().toString()));
    }
    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }

}
