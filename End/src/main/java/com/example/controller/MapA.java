package com.example.controller;

import com.example.HelloApplication;
import com.example.model.building.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MapA implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane mapA;
    @FXML
    ImageView imageView = new ImageView();

    @FXML
    void nighter(MouseEvent event) {
        if (ThisPlayer.getNighterNumber() > 0) {
            Image image = new Image("night.png");
            imageView.setCursor(Cursor.CLOSED_HAND);
            imageView.setImage(image);
            imageView.setFitHeight(40);
            imageView.setFitWidth(30);
            imageView.setLayoutX(ThisPlayer.getLenght());
            imageView.setLayoutY(ThisPlayer.getLenght());
            mapA.getChildren().add(imageView);
            Drag.makeDraggable(imageView);
            ThisPlayer.setNighterNumber(ThisPlayer.getNighterNumber() - 1);
            imageView = new ImageView();
            ThisPlayer.setLenght(ThisPlayer.getLenght() + 2);
        }
    }

    @FXML
    void archer(MouseEvent event) {
        if (ThisPlayer.getArcherNumber() > 0) {
            Image image = new Image("archer.png");
            imageView.setCursor(Cursor.CLOSED_HAND);
            imageView.setImage(image);
            imageView.setFitHeight(40);
            imageView.setFitWidth(30);
            imageView.setLayoutX(ThisPlayer.getLenght());
            imageView.setLayoutY(ThisPlayer.getLenght());
            mapA.getChildren().add(imageView);
            Drag.makeDraggable(imageView);
            ThisPlayer.setArcherNumber(ThisPlayer.getArcherNumber() - 1);
            imageView = new ImageView();
            ThisPlayer.setLenght(ThisPlayer.getLenght() + 2);
        }
    }

    @FXML
    void redpishi(MouseEvent event) {
        if (ThisPlayer.getRedPishiNumber() > 0) {
            Image image = new Image("redPishi.png");
            imageView.setCursor(Cursor.CLOSED_HAND);
            imageView.setImage(image);
            imageView.setFitHeight(40);
            imageView.setFitWidth(30);
            imageView.setLayoutX(ThisPlayer.getLenght());
            imageView.setLayoutY(ThisPlayer.getLenght());
            mapA.getChildren().add(imageView);
            Drag.makeDraggable(imageView);
            ThisPlayer.setRedPishiNumber(ThisPlayer.getRedPishiNumber() - 1);
            imageView = new ImageView();
            ThisPlayer.setLenght(ThisPlayer.getLenght() + 2);
        }
    }

    @FXML
    void warrior(MouseEvent event) {
        if (ThisPlayer.getWarriorNumber() > 0) {
            Image image = new Image("warrior.png");
            imageView.setCursor(Cursor.CLOSED_HAND);
            imageView.setImage(image);
            imageView.setFitHeight(40);
            imageView.setFitWidth(30);
            imageView.setLayoutX(ThisPlayer.getLenght());
            imageView.setLayoutY(ThisPlayer.getLenght());
            mapA.getChildren().add(imageView);
            Drag.makeDraggable(imageView);
            ThisPlayer.setWarriorNumber(ThisPlayer.getWarriorNumber() - 1);
            imageView = new ImageView();
            ThisPlayer.setLenght(ThisPlayer.getLenght() + 2);
        }
    }
}
