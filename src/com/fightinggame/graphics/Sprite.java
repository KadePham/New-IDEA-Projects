package com.fightinggame.graphics;

import com.fightinggame.resources.ResourceLoader;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Sprite {
    private BufferedImage image;
    private int width;
    private int height;
    private int displayWidth;
    private int displayHeight;

    public Sprite(String path, int displayWidth, int displayHeight) {
        this.image = ResourceLoader.loadImage("/sprites/" + path);
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        if (image != null) {
            width = image.getWidth();
            height = image.getHeight();
        } else {
            width = displayWidth;
            height = displayHeight;
        }
    }

    public Sprite(String path, int frameX, int frameY, int frameWidth, int frameHeight, int displayWidth, int displayHeight) {
        this.image = ResourceLoader.loadImage("/sprites/" + path);
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        if (image != null) {
            width = frameWidth;
            height = frameHeight;
            image = image.getSubimage(frameX * frameWidth, frameY * frameHeight, frameWidth, frameHeight);
        } else {
            width = displayWidth;
            height = displayHeight;
        }
    }

    public void draw(Graphics g, int x, int y) {
        if (image != null) {
            g.drawImage(image, x, y, displayWidth, displayHeight, null);
        } else {
            g.setColor(java.awt.Color.BLUE);
            g.fillRect(x, y, displayWidth, displayHeight);
        }
    }

    public int getDisplayWidth() { return displayWidth; }
    public int getDisplayHeight() { return displayHeight; }
}