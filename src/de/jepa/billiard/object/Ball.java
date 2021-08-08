package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.util.math.Vec2d;

import java.awt.*;

public class Ball {
    public static final int PIXEL_DRAW_RADIUS = 10;

    private BallColor color;
    private BallType type;

    private int number;

    private Vec2d position;
    private Vec2d velocity;

    public Ball(BallColor color, BallType type, int number) {
        // ToDo: Add set starting positions based on number
        this.color = color;
        this.type = type;
        this.number = number;
    }

    public void onGoal() {
        BallManager.removeBall(this);
        // ToDo: Add point to correct player
    }

    public void render(Graphics2D g) {
        g.setColor(color.getColor());
        // ToDo: Render ball
    }

    public void tick(){

    }

    @Override
    public String toString() {
        return "Ball(" + number + ")" + "{" + color + ", " + type + "}";
    }
}
