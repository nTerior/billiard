package de.jepa.billiard.window;

import javax.swing.*;

public class Window extends JFrame {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;

    public Window() {
        setTitle("Billiard");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
