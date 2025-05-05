package com.fightinggame.entities;

import com.fightinggame.utils.Vector2D;

public class Sword extends Weapon {
    public Sword() {
        super(10, 1.5); // 10 damage, 1.5 units range
    }

    @Override
    public void attack() {
        System.out.println("Sword attack at " + System.currentTimeMillis() + " with damage: " + damage + ", range: " + range);
    }

    @Override
    public Vector2D getAttackEffectPosition(Vector2D playerPosition) {
        // Hiệu ứng xuất hiện bên phải nhân vật, cách 32px
        return new Vector2D(playerPosition.x + 32, playerPosition.y);
    }

    @Override
    public Vector2D getAttackEffectSize() {
        // Kích thước hiệu ứng
        return new Vector2D(20, 10);
    }
}