package de.jepa.billiard.object.balls;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.object.BallColor;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.object.BallType;
import de.jepa.billiard.object.StartingPosition;
import de.jepa.billiard.util.math.Vec2d;

import javax.xml.stream.events.StartDocument;
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
        this.position = StartingPosition.values()[number].getPosition();
        this.velocity = new Vec2d();
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
        g.fillOval((int) position.x, (int) position.y, PIXEL_DRAW_RADIUS, PIXEL_DRAW_RADIUS);
        // ToDo: Render ball
    }

    public void tick() {

    }

    @Override
    public String toString() {
        return "Ball(" + number + ")" + "{" + color + ", " + type + "}";
    }

    @Override
    public Ball clone() {
        Ball ball = new Ball(color, type, number);

        if (this instanceof BlackBall) {
            ball = new BlackBall();
        }
        if (this instanceof WhiteBall) {
            ball = new WhiteBall();
        }

        ball.position = position;
        ball.velocity = velocity;

        return ball;
    }
}
