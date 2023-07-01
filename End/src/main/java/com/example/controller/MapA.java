package com.example.controller;

import com.example.HelloApplication;
import com.example.model.building.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MapA implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    ImageView imageView = new ImageView();

    @FXML
    void nighter(MouseEvent event) {
        Image image = new Image("1_knight_.png");
        imageView.setCursor(Cursor.CLOSED_HAND);
        imageView.setImage(image);
        imageView.setFitHeight(70);
        imageView.setFitWidth(50);
        imageView.setLayoutX(100);
        imageView.setLayoutY(200);

        ChoseHero.root.getChildren().add(imageView);
    }
}
