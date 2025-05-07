package com.fightinggame.main;

import com.fightinggame.entities.Player;
import com.fightinggame.graphics.RenderEngine;
import com.fightinggame.input.InputHandler;
import com.fightinggame.utils.Constants;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Game extends JPanel implements Runnable {
    private Thread gameThread;
    private final int FPS = 60;
    private final long TARGET_TIME = 1000 / FPS;
    private Player player;
    private InputHandler inputHandler;
    private RenderEngine renderEngine;

    public Game() {
        setPreferredSize(new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        setDoubleBuffered(true);
        inputHandler = new InputHandler();
        addKeyListener(inputHandler);
        setFocusable(true);
        player = new Player(100, 100, 100);
        renderEngine = new RenderEngine();
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
        double dx = 0, dy = 0;
        if (inputHandler.isUp()) dy -= Constants.PLAYER_SPEED;
        if (inputHandler.isDown()) dy += Constants.PLAYER_SPEED;
        if (inputHandler.isLeft()) dx -= Constants.PLAYER_SPEED;
        if (inputHandler.isRight()) dx += Constants.PLAYER_SPEED;
        player.move(dx, dy);

        if (inputHandler.isAttackPressed()) {
            player.attack();
        }

        player.update();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        renderEngine.render(g, player);
    }
}