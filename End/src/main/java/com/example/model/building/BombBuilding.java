package com.example.model.building;

import com.example.controller.ThisPlayer;
import com.example.model.hero.Hero;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class BombBuilding extends Building implements defenceDuilding, Runnable {
    private int attackPower;
    private long speed;///mili second

    public BombBuilding(Location location) {
        super(location);
        setDefensive(true);
        setHealth(40);
        attackPower = 3;
        speed = 2000;
        Image image = new Image("Building4.jpg");
        ImageView imageView = new ImageView(image);
        setImageView(imageView);
    }

    @Override
    public void setImageView(ImageView imageView) {
        super.setImageView(imageView);
    }

    @Override
    public void run() {
        while (getHealth() > 0) {
            System.out.println("1");
            for (Hero hero : ThisPlayer.getHeroes()) {
                System.out.println("2");
                if (hero.getHealth() > 0) {
                    System.out.println("3");
                    if (Math.abs(getLocation().getFirstX() - hero.getMiddle().getX()) <= 15) {
                        hero.setHealth(hero.getHealth() - attackPower);
                        System.out.println("4");
                    }
                    if (Math.abs(getLocation().getLastX() - hero.getMiddle().getX()) <= 15) {
                        System.out.println("5");
                        hero.setHealth(hero.getHealth() - attackPower);
                    }
                    if (Math.abs(getLocation().getFirstY() - hero.getMiddle().getY()) <= 20) {
                        System.out.println("6");
                        hero.setHealth(hero.getHealth() - attackPower);
                    }
                    if (Math.abs(getLocation().getLastY() - hero.getMiddle().getY()) <= 20) {
                        System.out.println("7");
                        hero.setHealth(hero.getHealth() - attackPower);
                    }
                } else {
                    hero.notifyAll();
                }
            }
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
