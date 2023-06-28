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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SighIn implements Initializable {
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
        if (Players.getPlayers() != null) {
            for (Player player : Players.getPlayers()) {
                if (player.getId().equals(userName)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Please Choose Other Name");
                    alert.showAndWait();
                } else {
                    count++;
                }
            }
            if (count == Players.getPlayers().size()) {
                Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#]).{8,20}$");
                Matcher matcher = pattern.matcher(password);
                if (matcher.find()) {
                    Player player = new Player(userName , password);
                    Players.setPlayers(player);
                    ThisPlayer.setPlayer(player);
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("Please Choose Other Password \n small letters , capital letters , numbers , !@#");
                    alert.showAndWait();
                }
            }
        }else {
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#]).{8,20}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                Player player = new Player(userName , password);
                Players.setPlayers(player);
                ThisPlayer.setPlayer(player);
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Panel.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Please Choose Other Password \n small letters , capital letters , numbers , !@#");
                alert.showAndWait();
            }
        }

    }

}
