package com.example.model.hero;

import com.example.controller.Drag;
import com.example.controller.ThisPlayer;
import com.example.model.building.Middle;
import com.example.model.building.Building;
import com.example.model.building.Location;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Nighter extends Hero implements Runnable {
    public Nighter() {
        setName("nighter");
        setHealth(10);
        setPower(4);
        setTimeBetween(2000);
        setSpeed(0.5);
        Image image = new Image("1_knight_.png");
        ImageView imageView = new ImageView(image);
        setImageView(imageView);
    }

    @Override
    public void run() {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Middle middle = new Middle(Drag.getLayoutX(), Drag.getLayoutY());
        setMiddle(middle);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        achiveToBuildings();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    private void achiveToBuildings() {
        int index = nearBuilding();
        boolean trans = false;

        if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() <= this.getMiddle().getX()) {
            if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() >= this.getMiddle().getX()) {
                trans = true;
                double lenY;
                if (this.getMiddle().getY() >= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - this.getMiddle().getY();
                } else {
                    lenY = this.getMiddle().getY() - ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY();
                }
                TranslateTransition transition = new TranslateTransition();
                transition.setNode(ThisPlayer.getImageView());
                transition.setDuration(Duration.millis(lenY * getSpeed()));
                transition.setCycleCount(1);
                transition.setByY(lenY);
                transition.play();
            }
        }
        if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() <= this.getMiddle().getY()) {
            if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() >= this.getMiddle().getY()) {
                trans = true;
                double lenX;
                if (this.getMiddle().getX() >= 300) {
                    lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - this.getMiddle().getX();
                } else {
                    lenX = this.getMiddle().getX() - ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX();
                }
                TranslateTransition transition = new TranslateTransition();
                transition.setNode(ThisPlayer.getImageView());
                transition.setDuration(Duration.millis(lenX * getSpeed()));
                transition.setCycleCount(1);
                transition.setByX(lenX);
                transition.play();
            }
        }
        if (!trans) {
            double lenX = 0;
            double lenY = 0;
            if (this.getMiddle().getX() <= 300) {
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstX() - getMiddle().getX();
                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - getMiddle().getY();
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - getMiddle().getY();
                }
            } else {
                lenX = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastX() - getMiddle().getX();
                if (this.getMiddle().getY() <= 250) {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() - getMiddle().getY();
                } else {
                    lenY = ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() - getMiddle().getY();
                }
            }
            double lenPlus = Math.sqrt(lenX * lenX + lenY * lenY);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(ThisPlayer.getImageView());
            transition.setDuration(Duration.millis(lenPlus * getSpeed()));
            transition.setCycleCount(1);
            transition.setByX(lenX);
            transition.setByY(lenY);
            transition.play();
        }
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

    }
}
