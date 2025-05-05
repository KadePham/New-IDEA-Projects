package com.fightinggame.resources;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

public class ResourceLoader {
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ResourceLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}