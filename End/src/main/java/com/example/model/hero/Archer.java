package com.example.model.hero;

import com.example.controller.MapA;
import com.example.controller.ThisPlayer;
import com.example.model.building.Building;
import com.example.model.building.Location;
import com.example.model.building.Middle;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;

public class Archer extends Hero implements Shot, Runnable {
    private int redius;

    public Archer() {
        setName("Archer");
        setHealth(10);
        setPower(3);
        this.redius = 50;
        setTimeBetween(2000);
        setSpeed(20);
        Image image = new Image("Asset 148.png");
        ImageView imageView = new ImageView(image);
        setImageView(imageView);

    }

    @Override
    public void run() {
        Middle middle = new Middle(ThisPlayer.getX(), ThisPlayer.getY());
        setMiddle(middle);
        achieveToBuildings();
        try {
            waiter();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      //  attack();
    }

    private void waiter() throws InterruptedException {
        Thread.sleep(10000);
    }

    private void achieveToBuildings() {
        int index = nearBuilding();
        boolean trans = false;
        double lenY = 0;
        double lenX = 0;
        if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() <= this.getMiddle().getX()) {
            if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() >= this.getMiddle().getX()) {
                trans = true;

                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - this.getMiddle().getY() - 69;
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - this.getMiddle().getY() + 69;
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
                    lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - this.getMiddle().getX() + 64;
                } else {
                    lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() - this.getMiddle().getX() - 64;
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
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() - getMiddle().getX() - 15 - 35;
            } else {
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - getMiddle().getX() + 15 + 35;
            }
            if (this.getMiddle().getY() <= 250) {
                lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - getMiddle().getY() - 20 - 35;
            } else {
                lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - getMiddle().getY() + 20 + 35;
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

    private void attack() {
        Platform.runLater(() -> {
            Image image = new Image("a¬row.png");
            ImageView imageView = new ImageView(image);
            System.out.println("2");

            int index = nearBuilding();
            double lenY = ThisPlayer.getMap().getBuildings().get(index).getMiddle().getY() - ThisPlayer.getY();
            double lenX = ThisPlayer.getMap().getBuildings().get(index).getMiddle().getX() - ThisPlayer.getX();
            System.out.println("2");

            while (!ThisPlayer.getBuildings().get(index)) {
                imageView.setFitHeight(100);
                imageView.setFitWidth(30);
                System.out.println("23");

                imageView.setX(ThisPlayer.getX());
                imageView.setY(ThisPlayer.getY());
                System.out.println("24");

                ThisPlayer.getMapA().getMapA().getChildren().add(imageView);

                TranslateTransition transition = new TranslateTransition();
                transition.setNode(imageView);
                transition.setDuration(Duration.millis(2000));
                transition.setCycleCount(1);
                transition.setByY(lenY);
                transition.setByX(lenX);
                transition.play();
                System.out.println("25");

                ThisPlayer.getMap().getBuildings().get(index).setHealth(ThisPlayer.getMap().getBuildings().get(index).getHealth() - getPower());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("26");

                if (ThisPlayer.getMap().getBuildings().get(index).getHealth() <= 0) {
                    ThisPlayer.getBuildings().remove(index);
                    ThisPlayer.getBuildings().add(index, true);
                }
                ThisPlayer.getMapA().getMapA().getChildren().remove(imageView);
            }
        });
    }
}

