package com.example.model.player;

import java.util.ArrayList;

public class Players {
   private static ArrayList<Player> players  = new ArrayList<>();

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(Player player) {
        players.add(player);
    }
}
