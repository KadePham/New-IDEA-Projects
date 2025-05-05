package com.fightinggame.entities;

public abstract class Weapon {
    protected int damage;
    protected double range;

    public Weapon(int damage, double range) {
        this.damage = damage;
        this.range = range;
    }

    public abstract void attack();
}