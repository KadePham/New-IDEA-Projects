package com.fightinggame.graphics;

import com.fightinggame.entities.Player;
import com.fightinggame.entities.Sword;
import com.fightinggame.utils.Vector2D;
import java.awt.Graphics;

public class RenderEngine {
    public void render(Graphics g, Player player) {
        // Vẽ nhân vật
        Sprite sprite = player.getSprite();
        sprite.draw(g, (int) player.getPosition().x, (int) player.getPosition().y);

        // Vẽ hiệu ứng tấn công
        if (player.isAttacking() && player.getWeapon() instanceof Sword) {
            Sword sword = (Sword) player.getWeapon();
            Vector2D effectPos = sword.getAttackEffectPosition(player.getPosition());
            Sprite attackSprite = new Sprite("sword_attack.png", 20, 10);
            attackSprite.draw(g, (int) effectPos.x, (int) effectPos.y);
        }
    }
}