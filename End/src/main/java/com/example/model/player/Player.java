package com.example.model.player;

import com.example.model.map.Map;

public class Player {
    private final String id;
    private final String password;
    private int level;
    private int win = 0;
    private int lost = 0;

    private Map map ;
    public Player(String id, String password ) {
        this.id = id;
        this.password = password;
        this.level = 1;/////////////////////////////////////////////////starrr
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }

    public int getLost() {
        return lost;
    }
}
