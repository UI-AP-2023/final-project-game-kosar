package com.example.controller;

import com.example.HelloApplication;
import com.example.model.building.*;
import com.example.model.hero.Nighter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class MapA implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane mapA;

    ImageView copy(ImageView imageView) {
        ImageView imageView1 = new ImageView(imageView.getImage());
        return imageView1;
    }

    @FXML
    void nighter(MouseEvent event) {
        System.out.println("q");
        if (ThisPlayer.getNighterNumber() > 0) {
            AtomicReference<ImageView> test = new AtomicReference<>();
            Image image = new Image("1_knight_.png");
            ImageView imageView = new ImageView(image);
            Nighter nighter = new Nighter();
            Node hero = imageView;

            hero.setOnMousePressed(e -> {
                test.set(copy((ImageView) hero));
                hero.setCursor(Cursor.CLOSED_HAND);
            });

            hero.setOnMouseDragged(e -> {
                test.get().setTranslateX(e.getSceneX());
                test.get().setTranslateY(e.getSceneY());
            });

            hero.setOnMouseReleased(e -> {
                mapA.getChildren().add(hero);
            });

            ThisPlayer.setNighterNumber(ThisPlayer.getNighterNumber() - 1);
            System.out.println("ss");
        }
    }

    @FXML
    void archer(MouseEvent event) {

    }

    @FXML
    void redpishi(MouseEvent event) {

    }

    @FXML
    void warrior(MouseEvent event) {

    }
}
