package com.example.controller;

import com.example.model.map.MapA;
import com.example.model.map.MapB;
import com.example.model.map.MapC;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowMap implements Initializable {
    @FXML
    private ImageView map;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if ( ThisPlayer.getPlayer().getMap() instanceof MapA){
            Image image = new Image("1_knight_.png");
            this.map.setImage(image);
        }else if ( ThisPlayer.getPlayer().getMap() instanceof MapB){

        }else if ( ThisPlayer.getPlayer().getMap() instanceof MapC){

        }else {

        }
    }
}
