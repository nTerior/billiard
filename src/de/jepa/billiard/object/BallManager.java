package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import java.awt.*;
import java.util.ArrayList;

public class BallManager {

    private ArrayList<Ball> balls;

    public BallManager() {
        balls = new ArrayList<>();
    }

    public void render(Graphics2D g) {
        for(int i = 0; i < balls.size(); i++) {
            balls.get(i).render(g);
        }
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public static void moveBalls(long deltaTime){

    }
}
