package com.fightinggame.graphics;

import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Sprite {
    private BufferedImage image;
    private int width = 32; // Kích thước sprite giả
    private int height = 32;

    public Sprite(String path) {
        // Tạm thời không tải hình ảnh, sẽ dùng hình chữ nhật
        // Sau này: image = ResourceLoader.loadImage(path);
    }

    public void draw(Graphics g, int x, int y) {
        // Vẽ hình chữ nhật màu xanh làm sprite giả
        g.setColor(java.awt.Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
}