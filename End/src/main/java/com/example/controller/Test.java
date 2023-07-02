package com.example.controller;

import com.example.model.hero.Nighter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class Test implements Initializable
{
    @FXML
    private AnchorPane pane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image("1_knight_.png");
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);
    }

}
