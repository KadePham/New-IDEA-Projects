package com.fightinggame.entities;

import com.fightinggame.utils.Vector2D;

public abstract class Weapon {
    protected int damage;
    protected double range;

    public Weapon(int damage, double range) {
        this.damage = damage;
        this.range = range;
    }

    public abstract void attack();
    public abstract Vector2D getAttackEffectPosition(Vector2D playerPosition);
    public abstract Vector2D getAttackEffectSize();
}