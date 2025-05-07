package com.fightinggame.graphics;

import com.fightinggame.entities.Player;
import com.fightinggame.entities.Sword;
import java.awt.Graphics;

public class RenderEngine {
    public void render(Graphics g, Player player) {
        int playerX = (int) player.getPosition().x;
        int playerY = (int) player.getPosition().y;

        // Vẽ nhân vật
        Sprite playerSprite = new Sprite("bone_warrior.png", 64, 64);
        playerSprite.draw(g, playerX, playerY);

        // Vẽ kiếm
        if (player.getWeapon() instanceof Sword) {
            Sword sword = (Sword) player.getWeapon();
            Sprite swordSprite = sword.getSwordSprite();
            int swordX = playerX + 40; // Gần tay phải
            int swordY = playerY + 10;
            swordSprite.draw(g, swordX, swordY);
        }

        // Vẽ hiệu ứng tấn công
        if (player.isAttacking() && player.getWeapon() instanceof Sword) {
            Sword sword = (Sword) player.getWeapon();
            Sprite attackSprite = sword.getAttackSprite();
            int effectX = playerX + 50; // Vị trí chém bên phải
            int effectY = playerY + 10;
            attackSprite.draw(g, effectX, effectY);
        }
    }
}