package com.fightinggame.graphics;

public class Animation {
    private Sprite[] frames;
    private int currentFrame;
    private long lastUpdate;
    private long frameDuration;

    public Animation(Sprite[] frames, long frameDuration) {
        this.frames = frames;
        this.frameDuration = frameDuration;
        this.currentFrame = 0;
        this.lastUpdate = System.nanoTime();
    }

    public Sprite getCurrentFrame() {
        long now = System.nanoTime();
        if (now - lastUpdate >= frameDuration) {
            currentFrame = (currentFrame + 1) % frames.length;
            lastUpdate = now;
        }
        return frames[currentFrame];
    }
}