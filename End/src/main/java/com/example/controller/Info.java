package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Info implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lost.setText("" + ThisPlayer.getPlayer().getLost());
        win.setText("" + ThisPlayer.getPlayer().getWin());
        userName.setText(ThisPlayer.getPlayer().getId());
        password.setText(ThisPlayer.getPlayer().getPassword());
    }

    @FXML
    private Text lost;

    @FXML
    private Text password;

    @FXML
    private Text userName;

    @FXML
    private Text win;
}
