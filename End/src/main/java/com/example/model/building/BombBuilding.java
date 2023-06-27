package com.example.model.building;
import javafx.scene.image.ImageView;

import java.io.File;

public class BombBuilding extends Building implements defenceDuilding {
    private int attackPower;
    private long speed;///mili second
    public BombBuilding(Location location) {
        super(location);
        setDefensive(true);
        setHealth(40);
        attackPower = 5;
        speed = 4000;
        setImageView(new ImageView(new File(
                "P:\\Kosar\\final-project-pishi-nini\\demo\\src\\main\\resources\\com\\example\\demo\\Building3.jpg")
                .toURI().toString()));
    }

    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }

}
