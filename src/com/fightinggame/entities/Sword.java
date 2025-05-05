package com.fightinggame.entities;

public class Sword extends Weapon {
    public Sword() {
        super(10, 1.5); // Example: 10 damage, 1.5 units range
    }

    @Override
    public void attack() {
        // Implement sword attack logic
        System.out.println("Sword attack with damage: " + damage);
    }
}