package com.fightinggame.entities;

public class Player {
    private double x, y;
    private int health;
    private Weapon weapon;

    public Player(double x, double y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.weapon = new Sword();
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void attack() {
        weapon.attack();
    }

    // Getters and setters
    public double getX() { return x; }
    public double getY() { return y; }
    public int getHealth() { return health; }
}