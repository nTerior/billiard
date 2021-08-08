package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.object.balls.BlackBall;
import de.jepa.billiard.object.balls.WhiteBall;

import java.awt.*;
import java.util.ArrayList;

public class BallManager {

    public static ArrayList<Ball> balls = new ArrayList<>();

    // Generates 7 full balls, 7 half balls, a Black and a white ball
    static {
        for (int i = 0; i < 7; i++) {
            balls.add(new Ball(BallColor.values()[i], BallType.FULL, i + 1));
        }
        balls.add(new BlackBall());
        for (int i = 0; i < 7; i++) {
            balls.add(new Ball(BallColor.values()[i], BallType.HALF, i + 9));
        }
        balls.add(new WhiteBall());
    }

    public static void move(WhiteBall whiteBall, long delta) {
        // ToDo: Move all balls accordingly to whiteBalls position and velocity
    }

    // Renders all balls at once
    public static void render(Graphics2D g) {
        for (int i = 0; i < balls.size(); i++) {
            balls.get(i).render(g);
        }
    }

    public static void removeBall(Ball ball) {
        balls.remove(ball);
    }

    public static void moveBalls(long deltaTime){

    }

    // This state won't change => Call every time for ball state retrieval
    public static ArrayList<Ball> getCurrentState() {
        ArrayList<Ball> list = new ArrayList<>();
        for (int i = 0; i < balls.size(); i++) {
            list.add(balls.get(i).clone());
        }
        return list;
    }
}
