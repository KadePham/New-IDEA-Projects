package com.fightinggame.entities;

public class Sword extends Weapon {
    public Sword() {
        super(10, 1.5); // 10 damage, 1.5 units range
    }

    @Override
    public void attack() {
        System.out.println("Sword attack at " + System.currentTimeMillis() + " with damage: " + damage + ", range: " + range);
    }
}