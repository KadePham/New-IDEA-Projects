package com.fightinggame.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {
    private boolean up, down, left, right;
    private boolean attackJustPressed;
    private boolean attackHeld;

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: up = true; break;
            case KeyEvent.VK_S: down = true; break;
            case KeyEvent.VK_A: left = true; break;
            case KeyEvent.VK_D: right = true; break;
            case KeyEvent.VK_SPACE:
                if (!attackHeld) {
                    attackJustPressed = true;
                    attackHeld = true;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: up = false; break;
            case KeyEvent.VK_S: down = false; break;
            case KeyEvent.VK_A: left = false; break;
            case KeyEvent.VK_D: right = false; break;
            case KeyEvent.VK_SPACE:
                attackHeld = false;
                attackJustPressed = false;
                break;
        }
    }

    // Getters
    public boolean isUp() { return up; }
    public boolean isDown() { return down; }
    public boolean isLeft() { return left; }
    public boolean isRight() { return right; }
    public boolean isAttackPressed() {
        boolean result = attackJustPressed;
        attackJustPressed = false; // Reset ngay sau khi đọc
        return result;
    }
}