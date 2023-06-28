package com.example.model.hero;

import com.example.model.building.Location;
import javafx.scene.image.ImageView;

abstract public class Hero {
    private boolean alive = true;
    private String name;
    private int health;
    private int power ;
    private long timeBetween ;
    private int speed ;
    private Location location;
    private ImageView imageView;
    public Hero( Location location ){
        this.location = location;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTimeBetween(long timeBetween) {
        this.timeBetween = timeBetween;
    }
}
