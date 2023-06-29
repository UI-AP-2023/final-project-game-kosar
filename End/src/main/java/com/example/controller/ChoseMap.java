package com.example.controller;

import com.example.HelloApplication;
import com.example.model.player.Player;
import com.example.model.player.Players;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChoseMap implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    void mapA(MouseEvent event) throws IOException {
        ThisPlayer.getPlayer().setMap(new com.example.model.map.MapA());
        for (Player player : Players.getPlayers()){
            if ( player.equals(ThisPlayer.getPlayer())){
                player.setMap(new com.example.model.map.MapA());
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void mapB(MouseEvent event) throws IOException {
        ThisPlayer.getPlayer().setMap(new com.example.model.map.MapB());
        for (Player player : Players.getPlayers()){
            if ( player.equals(ThisPlayer.getPlayer())){
                player.setMap(new com.example.model.map.MapB());
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void mapC(MouseEvent event) throws IOException {
        ThisPlayer.getPlayer().setMap(new com.example.model.map.MapC());
        for (Player player : Players.getPlayers()){
            if ( player.equals(ThisPlayer.getPlayer())){
                player.setMap(new com.example.model.map.MapC());
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void mapD(MouseEvent event) throws IOException {
        ThisPlayer.getPlayer().setMap(new com.example.model.map.MapD());
        for (Player player : Players.getPlayers()){
            if ( player.equals(ThisPlayer.getPlayer())){
                player.setMap(new com.example.model.map.MapD());
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
