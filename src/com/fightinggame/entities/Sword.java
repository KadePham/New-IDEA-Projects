package com.fightinggame.entities;

import com.fightinggame.graphics.Sprite;
import com.fightinggame.utils.Vector2D;

public class Sword extends Weapon {
    private Sprite swordSprite;
    private Sprite attackSprite;

    public Sword() {
        super(10, 1.5);
        this.swordSprite = new Sprite("sword.png", 32, 16);
        this.attackSprite = new Sprite("sword_slash.png", 48, 24);
    }

    @Override
    public void attack() {
        System.out.println("Sword attack at " + System.currentTimeMillis() + " with damage: " + damage + ", range: " + range);
    }

    public Sprite getSwordSprite() {
        return swordSprite;
    }

    public Sprite getAttackSprite() {
        return attackSprite;
    }

    @Override
    public Vector2D getAttackEffectPosition(Vector2D playerPosition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vector2D getAttackEffectSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}