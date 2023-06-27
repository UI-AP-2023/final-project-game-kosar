package com.example.model.player;

public class Player {
    private final String id;
    private final String password;
    private int level;
    private int win;
    private int lost;

    public Player(String id, String password) {
        this.id = id;
        this.password = password;
        this.level = 1;/////////////////////////////////////////////////starrr
        this.lost = 0;
        this.win = 0;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }
}
