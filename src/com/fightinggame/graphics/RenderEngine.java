package com.fightinggame.graphics;

import java.awt.Graphics;
import com.fightinggame.entities.Player;

public class RenderEngine {
    public void render(Graphics g, Player player) {
        Sprite sprite = player.getSprite();
        sprite.draw(g, (int) player.getPosition().x, (int) player.getPosition().y);
    }
}