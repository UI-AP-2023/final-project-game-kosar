package com.example.controller;

import com.example.HelloApplication;
import com.example.model.building.*;
import com.example.model.hero.Archer;
import com.example.model.hero.Nighter;
import com.example.model.hero.RedPishi;
import com.example.model.hero.Warrior;
import com.example.model.player.Player;
import com.example.model.player.Players;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class MapA implements Initializable {
    public MapA() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private ImageView b0;
    @FXML
    private ImageView b1;

    @FXML
    private ImageView b2;

    @FXML
    private ImageView b3;

    @FXML
    private ImageView b4;

    @FXML
    private ImageView b5;

    @FXML
    private ImageView b6;

    @FXML
    private ImageView b7;

    @FXML
    private ImageView b8;
    @FXML
    private AnchorPane mapA;
    private boolean nighter = false;
    private boolean warrior = false;
    private boolean redPishi = false;
    private boolean atcher = false;

    public AnchorPane getMapA() {
        return mapA;
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
            mapA.getChildren().add(imageView);
            nighter = false;

            ThisPlayer.setNighterNumber(ThisPlayer.getNighterNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Nighter nighter1 = new Nighter();
            ThisPlayer.seterHeroes(nighter1);
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
            mapA.getChildren().add(imageView);
            warrior = false;

            ThisPlayer.setWarriorNumber(ThisPlayer.getWarriorNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Warrior warrior1 = new Warrior();
            ThisPlayer.seterHeroes(warrior1);
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
            mapA.getChildren().add(imageView);
            atcher = false;

            ThisPlayer.setArcherNumber(ThisPlayer.getArcherNumber() - 1);
            ThisPlayer.setImageView(imageView);

            Archer archer = new Archer();
            ThisPlayer.seterHeroes(archer);
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
            mapA.getChildren().add(imageView);
            redPishi = false;

            ThisPlayer.setRedPishiNumber(ThisPlayer.getRedPishiNumber() - 1);
            ThisPlayer.setImageView(imageView);

            RedPishi redPishi1 = new RedPishi();
            ThisPlayer.seterHeroes(redPishi1);
            Thread thread = new Thread(redPishi1);
            thread.start();
        }
        ThisPlayer.setMapA(this);
        ArrayList<ImageView> imageViews = new ArrayList<>();
        imageViews.add(b0);
        imageViews.add(b1);
        imageViews.add(b3);
        imageViews.add(b2);
        imageViews.add(b4);
        imageViews.add(b8);
        imageViews.add(b7);
        imageViews.add(b5);
        imageViews.add(b6);

        ThisPlayer.setImageViews(imageViews);

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
                if (ThisPlayer.getWin()) {
                    player.setWin(player.getWin() + 1);
                } else {
                    player.setLost(player.getLost() + 1);
                }
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
