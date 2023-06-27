package com.example.model.building;

import javafx.scene.image.ImageView;

abstract public class Building {
    private Boolean defensive;
    private int health;
    private ImageView imageView;
    private Location location ;
    public Building(Location location) {
        this.location = location;
    }

    public void setDefensive(Boolean defensive) {
        this.defensive = defensive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
