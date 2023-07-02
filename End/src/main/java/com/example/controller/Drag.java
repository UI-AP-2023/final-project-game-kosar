package com.example.controller;

import javafx.scene.Node;

public class Drag {
    private static double X;
    private static double Y;
    private static  double layoutX;
    private static double layoutY ;
    public static void makeDraggable(Node node) {
        node.setOnMousePressed(mouseEvent -> {
            X = mouseEvent.getX();
            Y = mouseEvent.getY();
            layoutX = mouseEvent.getSceneX();
            layoutY = mouseEvent.getSceneY();
        });
        node.setOnMouseDragged(mouseEvvent -> {
            node.setLayoutX(mouseEvvent.getSceneX() - X);
            node.setLayoutY(mouseEvvent.getSceneY() - Y);
        });
    }

    public static double getLayoutY() {
        return layoutY;
    }

    public static double getLayoutX() {
        return layoutX;
    }

    public static double getY() {
        return Y;
    }

    public static double getX() {
        return X;
    }
}
