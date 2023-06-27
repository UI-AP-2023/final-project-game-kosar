package com.example;

import com.example.model.player.Player;
import com.example.model.player.Players;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 569, 327);
        stage.setScene(scene);
        stage.show();

        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SighLog.fxml"));
        scene = new Scene(fxmlLoader.load(), 569, 327);
        stage.setScene(scene);
        stage.show();

        Player player = new Player("1","1");
        Players.setPlayers(player);
    }
    public static void main(String[] args) {
        launch();
    }
}