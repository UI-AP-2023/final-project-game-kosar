package com.example.model.player;

public class ThisPlayer {
    static private Player player;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThisPlayer.player = player;
    }
}
