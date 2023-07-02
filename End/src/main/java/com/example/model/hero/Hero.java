package com.example.model.hero;

import com.example.model.building.Location;
import com.example.model.building.Middle;
import javafx.scene.image.ImageView;

abstract public class Hero {
    private boolean alive = true;
    private String name;
    private int health;
    private int power ;
    private long timeBetween ;
    private double speed ;
    private Middle middle;
    private ImageView imageView;
    public Hero(){

    }

    public Middle getMiddle() {
        return middle;
    }

    public double getSpeed() {
        return speed;
    }

    public void setMiddle(Middle middle) {
        this.middle = middle;
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

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setTimeBetween(long timeBetween) {
        this.timeBetween = timeBetween;
    }

    public ImageView getImageView() {
        return imageView;
    }
}
