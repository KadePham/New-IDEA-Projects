package com.fightinggame.entities;

import com.fightinggame.graphics.Sprite;
import com.fightinggame.utils.Vector2D;

public class Player {
    private Vector2D position;
    private int health;
    private Weapon weapon;
    private Sprite sprite;

    public Player(double x, double y, int health) {
        this.position = new Vector2D(x, y);
        this.health = health;
        this.weapon = new Sword();
        this.sprite = new Sprite("player.png"); // Tạm thời, dùng sprite giả
    }

    public void move(double dx, double dy) {
        position.add(new Vector2D(dx, dy));
    }

    public void attack() {
        weapon.attack();
    }

    // Getters
    public Vector2D getPosition() { return position; }
    public int getHealth() { return health; }
    public Sprite getSprite() { return sprite; }
}