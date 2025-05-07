package com.fightinggame.entities;

import com.fightinggame.graphics.Sprite;
import com.fightinggame.utils.Vector2D;

public class Player {
    private Vector2D position;
    private int health;
    private Weapon weapon;
    private boolean isAttacking;
    private long attackStartTime;
    private final long ATTACK_DURATION = 200_000_000; // 0.2 giây

    public Player(double x, double y, int health) {
        this.position = new Vector2D(x, y);
        this.health = health;
        this.weapon = new Sword();
    }

    public void move(double dx, double dy) {
        position.add(new Vector2D(dx, dy));
    }

    public void attack() {
        if (!isAttacking) {
            weapon.attack();
            isAttacking = true;
            attackStartTime = System.nanoTime();
        }
    }

    public void update() {
        if (isAttacking) {
            long currentTime = System.nanoTime();
            if (currentTime - attackStartTime >= ATTACK_DURATION) {
                isAttacking = false;
            }
        }
    }

    // Getters
    public Vector2D getPosition() { return position; }
    public int getHealth() { return health; }
    public boolean isAttacking() { return isAttacking; }
    public Weapon getWeapon() { return weapon; }
}