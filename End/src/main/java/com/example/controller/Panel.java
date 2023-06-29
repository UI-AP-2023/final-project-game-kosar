package com.example.controller;

import com.example.HelloApplication;
import com.example.model.player.ThisPlayer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Panel implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void attack(MouseEvent event) {

    }

    @FXML
    void hero(MouseEvent event) {

    }

    @FXML
    void info(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Info.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void map(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = null;
        System.out.println(ThisPlayer.getPlayer().getMap().getName());
        if (ThisPlayer.getPlayer().getMap().getName().equals("A")) {
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapA.fxml"));
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("B")) {
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapB.fxml"));
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("C")) {
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapC.fxml"));
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("D")) {
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapD.fxml"));
        }
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
