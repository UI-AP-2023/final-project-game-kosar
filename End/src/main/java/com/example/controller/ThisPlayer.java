package com.example.controller;

import com.example.model.building.Building;
import com.example.model.hero.Hero;
import com.example.model.map.Map;
import com.example.model.map.MapA;
import com.example.model.player.Player;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ThisPlayer {
    static private Player player;
    static private int indexEnemy;
    static private Map map;
    static private int archerNumber = 0;
    static private int warriorNumber = 0;
    static private int redPishiNumber = 0;
    static private int nighterNumber = 0;
    static private double X;
    static private double Y;
    static private ImageView imageView;
    static private ArrayList<Boolean> buildings = new ArrayList<>();
    static private ArrayList<ImageView> imageViews = new ArrayList<>();
    static private ArrayList<Hero> heroes = new ArrayList<>();
    static private Boolean win = false;

    public static Boolean getWin() {
        return win;
    }

    public static void setWin(Boolean win) {
        ThisPlayer.win = win;
    }

    public static void setHeroes(ArrayList<Hero> heroes) {
        ThisPlayer.heroes = heroes;
    }
    public static void seterHeroes (Hero hero){
        ThisPlayer.getHeroes().add(hero);
    }
    public static ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public static ArrayList<ImageView> getImageViews() {
        return imageViews;
    }

    public static void setImageViews(ArrayList<ImageView> imageViews) {
        ThisPlayer.imageViews = imageViews;
    }

    private static com.example.controller.MapA mapA  = new com.example.controller.MapA();

    public static com.example.controller.MapA getMapA() {
        return mapA;
    }

    public static void setMapA(com.example.controller.MapA mapA) {
        ThisPlayer.mapA = mapA;
    }

    public static ArrayList<Boolean> getBuildings() {
        return buildings;
    }

    public static void setBuildings(ArrayList<Boolean> buildings) {
        ThisPlayer.buildings = buildings;
    }

    public static ImageView getImageView() {
        return imageView;
    }

    public static void setImageView(ImageView imageView) {
        ThisPlayer.imageView = imageView;
    }

    public static void setY(double y) {
        Y = y;
    }

    public static void setX(double x) {
        X = x;
    }

    public static double getX() {
        return X;
    }

    public static double getY() {
        return Y;
    }

    public static int getArcherNumber() {
        return archerNumber;
    }

    public static int getNighterNumber() {
        return nighterNumber;
    }

    public static int getRedPishiNumber() {
        return redPishiNumber;
    }

    public static int getWarriorNumber() {
        return warriorNumber;
    }

    public static void setArcherNumber(int archerNumber) {
        ThisPlayer.archerNumber = archerNumber;
    }

    public static void setNighterNumber(int nighterNumber) {
        ThisPlayer.nighterNumber = nighterNumber;
    }

    public static void setRedPishiNumber(int redPishiNumber) {
        ThisPlayer.redPishiNumber = redPishiNumber;
    }

    public static void setWarriorNumber(int warriorNumber) {
        ThisPlayer.warriorNumber = warriorNumber;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        ThisPlayer.map = map;
        for (Building building : map.getBuildings()) {
            buildings.add(false);
        }
    }

    public static void setIndexEnemy(int indexEnemy) {
        ThisPlayer.indexEnemy = indexEnemy;
    }

    public static int getIndexEnemy() {
        return indexEnemy;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThisPlayer.player = player;
    }
}
