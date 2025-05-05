package com.fightinggame.main;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Game extends JPanel implements Runnable {
    private Thread gameThread;
    private final int FPS = 60;
    private final long TARGET_TIME = 1000 / FPS;

    public Game() {
        setPreferredSize(new Dimension(800, 600));
        setDoubleBuffered(true);
    }

    public void start() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        long startTime, elapsedTime, waitTime;
        while (true) {
            startTime = System.nanoTime();
            
            update();
            repaint();
            
            elapsedTime = System.nanoTime() - startTime;
            waitTime = TARGET_TIME - elapsedTime / 1000000;
            if (waitTime < 0) waitTime = 5;
            
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        // Update game state
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Render game objects
    }
}