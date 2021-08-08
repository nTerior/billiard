package de.jepa.billiard.object.balls;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.object.BallColor;
import de.jepa.billiard.object.BallType;

public class BlackBall extends Ball {
    public BlackBall() {
        super(BallColor.BLACK, BallType.FULL, 8);
    }

    @Override
    public void onGoal() {
        // ToDo: End Game
    }

    @Override
    public String toString() {
        return "BlackBall";
    }
}
