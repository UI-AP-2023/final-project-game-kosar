package com.example.controller;

import com.example.HelloApplication;
import com.example.model.hero.Archer;
import com.example.model.hero.Nighter;
import com.example.model.hero.RedPishi;
import com.example.model.hero.Warrior;
import com.example.model.player.Player;
import com.example.model.player.Players;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MapC implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private AnchorPane mapC;
    private boolean nighter = false;
    private boolean warrior = false;
    private boolean redPishi = false;
    private boolean atcher = false;

    public AnchorPane getMapC() {
        return mapC;
    }

    @FXML
    void press(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();
        ThisPlayer.setY(y);
        ThisPlayer.setX(x);
        if (nighter) {
            Image image = new Image("1_knight_.png");
            ImageView imageView = new ImageView(image);

            imageView.setFitHeight(40);
            imageView.setFitWidth(30);

            imageView.setX(x - 15);
            imageView.setY(y - 20);
            mapC.getChildren().add(imageView);
            nighter = false;

            ThisPlayer.setNighterNumber(ThisPlayer.getNighterNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Nighter nighter1 = new Nighter();
            Thread thread = new Thread(nighter1);
            thread.start();
        }
        if (warrior) {
            Image image = new Image("1_Woman warrior.png");
            ImageView imageView = new ImageView(image);

            imageView.setFitHeight(40);
            imageView.setFitWidth(30);

            imageView.setX(x - 15);
            imageView.setY(y - 20);
            mapC.getChildren().add(imageView);
            warrior = false;

            ThisPlayer.setWarriorNumber(ThisPlayer.getWarriorNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Warrior warrior1 = new Warrior();
            Thread thread = new Thread(warrior1);
            thread.start();
        }
        if (atcher) {
            Image image = new Image("Asset 148.png");
            ImageView imageView = new ImageView(image);

            imageView.setFitHeight(40);
            imageView.setFitWidth(30);

            imageView.setX(x - 15);
            imageView.setY(y - 20);
            mapC.getChildren().add(imageView);
            atcher = false;

            ThisPlayer.setArcherNumber(ThisPlayer.getArcherNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Archer archer =new Archer();
            Thread thread = new Thread(archer);
            thread.start();
        }
        if (redPishi) {
            Image image = new Image("2_Woman warrior.png");
            ImageView imageView = new ImageView(image);

            imageView.setFitHeight(40);
            imageView.setFitWidth(30);

            imageView.setX(x - 15);
            imageView.setY(y - 20);
            mapC.getChildren().add(imageView);
            redPishi = false;

            ThisPlayer.setRedPishiNumber(ThisPlayer.getRedPishiNumber() - 1);
            ThisPlayer.setImageView(imageView);

            RedPishi redPishi1 = new RedPishi();
            Thread thread = new Thread(redPishi1);
            thread.start();
        }
    }

    @FXML
    void nighter(MouseEvent event) {
        if (ThisPlayer.getNighterNumber() > 0) {
            warrior = false;
            redPishi = false;
            atcher = false;
            nighter = true;
        }
    }

    @FXML
    void archer(MouseEvent event) {
        if (ThisPlayer.getArcherNumber() > 0) {
            redPishi = false;
            nighter = false;
            warrior = false;
            atcher = true;
        }
    }

    @FXML
    void redpishi(MouseEvent event) {
        if (ThisPlayer.getRedPishiNumber() > 0) {
            warrior = false;
            nighter = false;
            atcher = false;
            redPishi = true;
        }
    }

    @FXML
    void warrior(MouseEvent event) {
        if (ThisPlayer.getWarriorNumber() > 0) {
            nighter = false;
            redPishi = false;
            atcher = false;
            warrior = true;
        }
    }

    @FXML
    void back(MouseEvent event) throws IOException {
        for (Player player : Players.getPlayers()) {
            if (player.equals(ThisPlayer.getPlayer())) {
                player.setLost(player.getLost() + 1);
                ThisPlayer.setPlayer(player);
                break;
            }
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
