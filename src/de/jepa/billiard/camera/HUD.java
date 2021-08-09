package de.jepa.billiard.camera;

import de.jepa.billiard.io.Mouse;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.object.balls.Ball;

import java.awt.*;

/*
 * Copyright by Paul Stier, 2021
 */
public class HUD {

    public void render(Graphics2D g) {
    }

    public void renderDrag(Graphics2D g) {
        if (Mouse.dragDir.x == 0 && Mouse.dragDir.y == 0) return;

        g.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        g.setColor(Color.RED);
        g.drawLine((int) BallManager.whiteBall.getPosition().x + Ball.PIXEL_DRAW_RADIUS / 2, (int) BallManager.whiteBall.getPosition().y + Ball.PIXEL_DRAW_RADIUS / 2, (int) BallManager.whiteBall.getPosition().x + Mouse.dragDir.x + Ball.PIXEL_DRAW_RADIUS / 2, (int) BallManager.whiteBall.getPosition().y + Mouse.dragDir.y);
    }
}
