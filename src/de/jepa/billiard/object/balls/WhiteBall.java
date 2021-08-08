package de.jepa.billiard.object.balls;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.object.Ball;
import de.jepa.billiard.object.BallColor;
import de.jepa.billiard.object.BallType;

public class WhiteBall extends Ball {
    public WhiteBall() {
        super(BallColor.WHITE, BallType.FULL, 0);
    }

    @Override
    public void onGoal() {
        // ToDo: Reset position + change active player
    }

    @Override
    public String toString() {
        return "WhiteBall";
    }
}
