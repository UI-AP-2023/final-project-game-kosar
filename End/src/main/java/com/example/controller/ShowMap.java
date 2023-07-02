package com.example.controller;

import com.example.HelloApplication;
import com.example.model.map.MapA;
import com.example.model.map.MapB;
import com.example.model.map.MapC;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowMap implements Initializable {
    @FXML
    private ImageView map;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if ( ThisPlayer.getPlayer().getMap() instanceof MapA){
            Image image = new Image("MapA.png");
            this.map.setImage(image);
        }else if ( ThisPlayer.getPlayer().getMap() instanceof MapB){
            Image image = new Image("MapB.png");
            this.map.setImage(image);
        }else if ( ThisPlayer.getPlayer().getMap() instanceof MapC){
            Image image = new Image("MapC.png");
            this.map.setImage(image);
        }else {
            Image image = new Image("MapD.png");
            this.map.setImage(image);
        }
    }

    @FXML
    void back(MouseEvent event) throws IOException {
        ThisPlayer.setPlayer(null);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
