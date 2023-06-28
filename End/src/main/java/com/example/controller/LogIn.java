package com.example.controller;

import com.example.HelloApplication;
import com.example.model.player.Player;
import com.example.model.player.Players;
import com.example.model.player.ThisPlayer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LogIn implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    void submit(MouseEvent event) throws IOException {
        String password = this.password.getText();
        String userName = this.userName.getText();
        int count = 0;
        for (Player player : Players.getPlayers()) {
            if (player.getId().equals(userName)) {
                if ( player.getPassword().equals(password)){
                    ThisPlayer.setPlayer(player);
                    System.out.println(ThisPlayer.getPlayer().getId());
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                }else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Wrong Information");
                    alert.setContentText("Your Password Is Incorrect");
                    alert.showAndWait();
                }
            } else {
                count++;
            }
        }
        if ( count == Players.getPlayers().size()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Wrong Information");
            alert.setContentText("Your UserName Is Incorrect");
            alert.showAndWait();
        }
    }

}
