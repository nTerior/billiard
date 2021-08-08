package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.util.math.Vec2d;

import java.awt.*;

public abstract class Ball {
    public static final int PIXEL_DRAW_SIZE = 20;

    private BallColor color;
    private BallType type;

    private int number;

    private Vec2d position;
    private Vec2d velocity;

    abstract void onGoal();
    abstract void render(Graphics2D g);
}
