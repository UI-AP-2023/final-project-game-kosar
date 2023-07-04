package com.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Info implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userName.setText(ThisPlayer.getPlayer().getId());
        password.setText(ThisPlayer.getPlayer().getPassword());
        lost.setText("" + ThisPlayer.getPlayer().getLost());
        win.setText("" + ThisPlayer.getPlayer().getWin());
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
