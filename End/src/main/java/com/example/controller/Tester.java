package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Tester implements Initializable {
    private boolean aaa = false;
    @FXML
    private AnchorPane pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void nighter(MouseEvent event) {
        aaa = true;
    }

    @FXML
    void press(MouseEvent event) {
        if (aaa) {
            double x = event.getX();
            double y = event.getY();
            Image image = new Image("1_knight_.png");
            ImageView imageView = new ImageView(image);

            imageView.setFitHeight(100);
            imageView.setFitWidth(100);

            imageView.setX(x);
            imageView.setY(y);
            pane.getChildren().add(imageView);
            aaa = false;
        }
    }
}
