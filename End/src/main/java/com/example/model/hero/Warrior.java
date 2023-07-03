package com.example.model.hero;

import com.example.controller.ThisPlayer;
import com.example.model.building.Building;
import com.example.model.building.Middle;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class Warrior extends Hero implements Runnable {
    public Warrior() {
        setName("Warrior");
        setHealth(15);
        setPower(3);
        setTimeBetween(2000);
        setSpeed(20);
        Image image = new Image("1_Woman warrior.png");
        ImageView imageView = new ImageView(image);
        setImageView(imageView);
    }

    @Override
    public void run() {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Middle middle = new Middle(ThisPlayer.getX(), ThisPlayer.getY());
        setMiddle(middle);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        archiveToBuildings();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            attack();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void archiveToBuildings() {
        int index = nearBuilding();
        boolean trans = false;
        double lenX = 0;
        double lenY = 0;
        if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() <= this.getMiddle().getX()) {
            if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() >= this.getMiddle().getX()) {
                trans = true;
                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - this.getMiddle().getY() - 20;
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - this.getMiddle().getY() + 20;
                }
                TranslateTransition transition = new TranslateTransition();
                transition.setNode(ThisPlayer.getImageView());
                transition.setDuration(Duration.millis(Math.abs(lenY * getSpeed())));
                transition.setCycleCount(1);
                transition.setByY(lenY);
                transition.play();
            }
        }
        if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() <= this.getMiddle().getY()) {
            if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() >= this.getMiddle().getY()) {
                trans = true;
                if (this.getMiddle().getX() >= 300) {
                    lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - this.getMiddle().getX() + 15;
                } else {
                    lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() - this.getMiddle().getX() - 15;
                }
                TranslateTransition transition = new TranslateTransition();
                transition.setNode(ThisPlayer.getImageView());
                transition.setDuration(Duration.millis(Math.abs(lenX * getSpeed())));
                transition.setCycleCount(1);
                transition.setByX(lenX);
                transition.play();
            }
        }
        if (!trans) {
            if (this.getMiddle().getX() <= 300) {
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() - getMiddle().getX() - 15;
                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - getMiddle().getY() - 20;
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - getMiddle().getY() + 20;
                }
            } else {
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - getMiddle().getX() + 15;
                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - getMiddle().getY() - 20;
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - getMiddle().getY() + 20;
                }
            }
            double lenPlus = Math.sqrt(lenX * lenX + lenY * lenY);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(ThisPlayer.getImageView());
            transition.setDuration(Duration.millis(Math.abs(lenPlus * getSpeed())));
            transition.setCycleCount(1);
            transition.setByX(lenX);
            transition.setByY(lenY);
            transition.play();
        }
        ThisPlayer.setX(ThisPlayer.getX() + lenX);
        ThisPlayer.setY(ThisPlayer.getY() + lenY);
    }

    private int nearBuilding() {
        ArrayList<Double> len = new ArrayList<>();
        ArrayList<Double> len1 = new ArrayList<>();

        for (Building building : ThisPlayer.getMap().getBuildings()) {
            double lenX = building.getMiddle().getX() - this.getMiddle().getX();
            lenX = Math.abs(lenX);

            double lenY = building.getMiddle().getY() - this.getMiddle().getY();
            lenY = Math.abs(lenY);

            double lenth = Math.sqrt((lenX * lenX) + (lenY * lenY));
            len.add(lenth);
            len1.add(lenth);
        }
        len1.sort(Double::compareTo);

        for (int index = 0; index < len.size(); index++) {
            if (len.get(index).equals(len1.get(0))) {
                return index;
            }
        }
        return 0;
    }
    private void attack() throws InterruptedException {
        int index = nearBuilding();

        while (!ThisPlayer.getBuildings().get(index)) {
            if (getHealth() > 0) {
                ThisPlayer.getMap().getBuildings().get(index).setHealth(ThisPlayer.getMap().getBuildings().get(index).getHealth() - getPower());
                Thread.sleep(this.getTimeBetween());
                System.out.println("3");
                if (ThisPlayer.getMap().getBuildings().get(index).getHealth() <= 0) {
                    ThisPlayer.getBuildings().add(index, true);
                    System.out.println("done3");
                    Warrior warrior = new Warrior();
                    warrior.setHealth(this.getHealth());
                    Thread thread = new Thread(warrior);
                    thread.start();
                }
            }else {
                TranslateTransition transition = new TranslateTransition();
                transition.setNode(ThisPlayer.getImageView());
                transition.setDuration(Duration.millis(2000));
                transition.setCycleCount(1);
                transition.setByX(-ThisPlayer.getX());
                transition.setByY(500-ThisPlayer.getY());
                transition.play();
            }
        }
    }
}
