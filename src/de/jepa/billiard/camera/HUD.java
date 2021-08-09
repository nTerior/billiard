package de.jepa.billiard.camera;

import de.jepa.billiard.io.Mouse;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.object.balls.Ball;

import java.awt.*;
import java.awt.geom.AffineTransform;

/*
 * Copyright by Paul Stier, 2021
 */
public class HUD {

    public void render(Graphics2D g) {
    }

    public void renderDrag(Graphics2D g) {
        if (Mouse.dragDir.x == 0 && Mouse.dragDir.y == 0) return;

        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(2));

        int centerX = (int) BallManager.whiteBall.getPosition().x + Ball.PIXEL_DRAW_RADIUS / 2;
        int centerY = (int) BallManager.whiteBall.getPosition().y + Ball.PIXEL_DRAW_RADIUS / 2;

        AffineTransform transform = g.getTransform();
        g.translate(centerX, centerY);

        g.rotate(Math.atan2(centerY - Mouse.y, centerX - Mouse.x));

        int[] xPoints = {0, 0, (int) -BallManager.whiteBall.getPosition().distance(Mouse.x, Mouse.y)};
        int[] yPoints = {-Ball.PIXEL_DRAW_RADIUS / 2, Ball.PIXEL_DRAW_RADIUS / 2, 0};
        Polygon polygon = new Polygon(xPoints, yPoints, 3);
        g.fillPolygon(polygon);
        g.setColor(Color.BLACK);
        g.drawPolygon(polygon);

        g.setTransform(transform);
    }
}
