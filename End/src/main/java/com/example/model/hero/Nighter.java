package com.example.model.hero;

import com.example.controller.MapA;
import com.example.controller.ThisPlayer;
import com.example.model.building.Building;
import com.example.model.building.Middle;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class Nighter extends Hero implements Runnable {
    public Nighter() {
        setName("nighter");
        setHealth(10);
        setPower(15);
        setTimeBetween(2000);
        setSpeed(30);
        Image image = new Image("1_knight_.png");
        ImageView imageView = new ImageView(image);
        setImageView(imageView);
    }

    private int indexL = ThisPlayer.getBuildings().size() + 1;
    private int indexF = (ThisPlayer.getBuildings().size());
    private int index;

    @Override
    public void run() {
        while (getHealth() > 0) {
            Middle middle = new Middle(ThisPlayer.getX(), ThisPlayer.getY());
            setMiddle(middle);
            achieveToBuildings();
            try {
                attack();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void achieveToBuildings() {
        index = nearBuilding();
        boolean trans = false;
        boolean trans1 = false;
        double lenX = 0;
        double lenY = 0;
        if (index > 0) {
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
            if (!trans) {
                if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getFirstY() <= this.getMiddle().getY()) {
                    if (ThisPlayer.getMap().getBuildings().get(index).getLocation().getLastY() >= this.getMiddle().getY()) {
                        trans1 = true;
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
            }
            if (!trans) {
                if (!trans1) {
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

            }
        }else {
            ThisPlayer.setWin(true);
        }

        ThisPlayer.setX(ThisPlayer.getX() + lenX);
        ThisPlayer.setY(ThisPlayer.getY() + lenY);
    }

    private int nearBuilding() {
        System.out.println(indexF);
        System.out.println(indexL);

        if (this.getMiddle().getY() >= this.getMiddle().getX()) {
            indexL = indexL - 2;
            if (indexL >= 0) {
                System.out.println("00" + indexL);
                return indexL;
            } else {
                indexF = indexF - 2;
                System.out.println("00" + indexF);
                return indexF;
            }
        } else {
            indexF = indexF - 2;
            System.out.println("00" + indexF);
            if (indexF >= 0) {
                return indexF;
            } else {
                indexL = indexL - 2;
                System.out.println("00" + indexL);
                return indexL;
            }
        }
    }


    private void attack() throws InterruptedException {
        while (!ThisPlayer.getBuildings().get(index)) {
            if (getHealth() > 0) {
                ThisPlayer.getMap().getBuildings().get(index).setHealth(ThisPlayer.getMap().getBuildings().get(index).getHealth() - getPower());
                Thread.sleep(this.getTimeBetween());
                if (ThisPlayer.getMap().getBuildings().get(index).getHealth() <= 0) {
                    ThisPlayer.getImageViews().get(index).setVisible(false);
                    ThisPlayer.getBuildings().remove(index);
                    ThisPlayer.getBuildings().add(index, true);
                }
            } else {
                ThisPlayer.getImageView().setVisible(false);
                ThisPlayer.getHeroes().remove(this);
            }
        }
    }
}
