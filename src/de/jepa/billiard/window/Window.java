package de.jepa.billiard.window;

import de.jepa.billiard.util.math.Vec2i;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public static final Vec2i SIZE = new Vec2i(1000, 1000);

    public Window() {
        setTitle("Billiard");
        setSize(SIZE.x, SIZE.y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void addContent(Component component) {
        add(component);
        component.setVisible(true);
    }

    public void display() {
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
