package com.example.end.model.player;

import com.example.demo.Model.Player.Player;
import com.example.end.model.player.Player;

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
