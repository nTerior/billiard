package de.jepa.billiard.object.balls;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.object.BallColor;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.object.BallType;
import de.jepa.billiard.object.StartingPosition;
import de.jepa.billiard.util.math.Vec2d;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Ball {
    public static final int PIXEL_DRAW_RADIUS = 30;

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
        RoundRectangle2D.Double shape = new RoundRectangle2D.Double((int) position.x, (int) (position.y + PIXEL_DRAW_RADIUS / 2.75), PIXEL_DRAW_RADIUS, PIXEL_DRAW_RADIUS / 3, PIXEL_DRAW_RADIUS / 3, PIXEL_DRAW_RADIUS / 3);

        g.setColor(color.getColor());
        g.fillOval((int) position.x, (int) position.y, PIXEL_DRAW_RADIUS, PIXEL_DRAW_RADIUS);

        if (type == BallType.HALF) {
            g.setColor(Color.WHITE);
            g.fill(shape);
        }

        g.setColor(Color.BLACK);

        // Outlines
        g.setStroke(new BasicStroke(2));
        g.drawOval((int) position.x, (int) position.y, PIXEL_DRAW_RADIUS, PIXEL_DRAW_RADIUS);

        if (number == 8) g.setColor(Color.WHITE);

        g.setFont(new Font("Arial", Font.PLAIN, 20));
        FontMetrics m = g.getFontMetrics();

        int x = (int) position.x + (PIXEL_DRAW_RADIUS - m.stringWidth(number + "")) / 2;
        int y = (int) position.y + ((PIXEL_DRAW_RADIUS - m.getHeight()) / 2) + m.getAscent();

        if(number != 0)
            g.drawString(number + "", x, y);
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

    public Vec2d getPosition() {
        return position;
    }

    public void setPosition(Vec2d position) {
        this.position = position;
    }
}
