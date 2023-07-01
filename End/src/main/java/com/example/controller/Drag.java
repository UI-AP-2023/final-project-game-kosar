package com.example.controller;

import javafx.scene.Node;

public class Drag {
    private static double X;
    private static double Y;

    public static void makeDraggable(Node node) {
        node.setOnMousePressed(mouseEvent -> {
            X = mouseEvent.getX();
            Y = mouseEvent.getY();
        });
        node.setOnMouseDragged(mouseEvvent -> {
            node.setLayoutX(mouseEvvent.getSceneX() - X);
            node.setLayoutY(mouseEvvent.getSceneY() - Y);
        });
    }

}
