package com.example.model.building;

import javafx.scene.image.ImageView;

abstract public class Building {
    private Boolean defensive;
    private int health;
    private ImageView imageView;
    private Location location;
    private Middle middle;

    public Building(Location location) {
        this.location = location;
        middle = new Middle(((location.getFirstX() + location.getLastX()) / 2), ((location.getLastY() + location.getFirstY()) / 2));

    }

    public Middle getMiddle() {
        return middle;
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

    public Location getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public Boolean getDefensive() {
        return defensive;
    }
}
