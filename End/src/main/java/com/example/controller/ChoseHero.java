package com.example.controller;

import com.example.HelloApplication;
import com.example.model.player.Players;
import com.example.model.map.MapA;
import com.example.model.map.MapB;
import com.example.model.map.MapC;
import com.example.model.map.MapD;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class ChoseHero implements Initializable {
    static public Pane root = new Pane();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        number.setText("" + Players.getPlayers().get(ThisPlayer.getIndexEnemy()).getMap().getNumberOfHero());
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20);
        valueFactory.setValue(0);
        SpinnerValueFactory<Integer> valueFactory1 =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20);
        valueFactory.setValue(0);
        SpinnerValueFactory<Integer> valueFactory2 =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20);
        valueFactory.setValue(0);
        SpinnerValueFactory<Integer> valueFactory3 =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20);
        valueFactory.setValue(0);
        valueFactory1.setValue(0);
        valueFactory2.setValue(0);
        valueFactory3.setValue(0);
        archerSpinner.setValueFactory(valueFactory);
        redPishiSpinner.setValueFactory(valueFactory1);
        WarriorSpinner.setValueFactory(valueFactory2);
        nightSpinner.setValueFactory(valueFactory3);
    }


    @FXML
    private Spinner<Integer> WarriorSpinner;

    @FXML
    private Spinner<Integer> archerSpinner;

    @FXML
    private Spinner<Integer> nightSpinner;

    @FXML
    private Text number;

    @FXML
    private Spinner<Integer> redPishiSpinner;

    @FXML
    void fight(MouseEvent event) throws IOException {
        int archerNum = archerSpinner.getValue();
        int warriorNum = WarriorSpinner.getValue();
        int nighterNum = nightSpinner.getValue();
        int redPishiNum = redPishiSpinner.getValue();

        if ((archerNum + warriorNum + nighterNum + redPishiNum) ==
                Players.getPlayers().get(ThisPlayer.getIndexEnemy()).getMap().getNumberOfHero()) {
            if (ThisPlayer.getMap() instanceof MapA) {
                root = FXMLLoader.load(getClass().getResource("MapA.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
            if (ThisPlayer.getMap() instanceof MapB) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapB.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
            if (ThisPlayer.getMap() instanceof MapC) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapC.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
            if (ThisPlayer.getMap() instanceof MapD) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MapD.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Wrong Number");
            alert.showAndWait();
        }
    }
}
