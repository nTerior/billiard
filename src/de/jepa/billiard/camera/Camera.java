package de.jepa.billiard.camera;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.io.MouseInterrupts;

import java.awt.*;

public class Camera extends Canvas {

    public Camera() {
        addMouseListener(new MouseInterrupts());
    }

    public void render(Graphics2D g) {

    }
}
