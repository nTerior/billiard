package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import java.awt.Color;

public enum BallColor {
    YELLOW(Color.YELLOW),
    BLUE(Color.CYAN),
    RED(Color.RED),
    GREEN(new Color(0, 128, 0)),
    LIGHT_GREEN(new Color(0, 220, 0)),
    PINK(Color.PINK),
    BLACK(Color.BLACK);

    Color color;

    BallColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
