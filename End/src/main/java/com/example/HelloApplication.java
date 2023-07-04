package com.example;

import com.example.model.map.MapA;
import com.example.model.player.Player;
import com.example.model.player.Players;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SighLog.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

        Player player = new Player("1","1");
        player.setMap(new MapA());
        Players.setPlayers(player);
    }
    public static void main(String[] args) {
        launch();
    }
}