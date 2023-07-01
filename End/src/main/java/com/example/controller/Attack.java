package com.example.controller;

import com.example.HelloApplication;
import com.example.model.building.BombBuilding;
import com.example.model.building.Location;
import com.example.model.hero.Archer;
import com.example.model.player.Players;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Attack implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        number.setText("" + Players.getPlayers().get(ThisPlayer.getIndexEnemy()).getMap().getNumberOfHero());
        if (ThisPlayer.getPlayer().getMap().getName().equals("A")) {
        ///   map.setImage(new Image("MapA.png"));
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("B")) {
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("C")) {
        } else if (ThisPlayer.getPlayer().getMap().getName().equals("D")) {
        }
    }

    @FXML
    private ImageView map;

    @FXML
    private Text number;


    @FXML
    void back(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void before(MouseEvent event) throws IOException {
        if (ThisPlayer.getIndexEnemy() > 0) {
            ThisPlayer.setIndexEnemy(ThisPlayer.getIndexEnemy() - 1);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Attack.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void fight(MouseEvent event) throws IOException {
        ThisPlayer.setMap(Players.getPlayers().get(ThisPlayer.getIndexEnemy()).getMap());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ChoseHero.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void next(MouseEvent event) throws IOException {
        if (ThisPlayer.getIndexEnemy() != Players.getPlayers().size() - 1) {
            ThisPlayer.setIndexEnemy(ThisPlayer.getIndexEnemy() + 1);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Attack.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
}
