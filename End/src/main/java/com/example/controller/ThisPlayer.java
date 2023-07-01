package com.example.controller;

import com.example.model.map.Map;
import com.example.model.player.Player;

public class ThisPlayer {
    static private Player player;
    static private int indexEnemy;
    static private Map map;
    static private int archerNumber =0 ;
    static private int warriorNumber = 0 ;
    static private int redPishiNumber = 0 ;
    static  private  int nighterNumber = 0;

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
