package com.example.controller;

import com.example.model.player.Player;

public class ThisPlayer {
    static private Player player;
    static private  int indexEnemy ;

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
