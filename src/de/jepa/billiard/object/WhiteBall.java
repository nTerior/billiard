package de.jepa.billiard.object;

/*
 * By Paul Stier, 8/8/21
 */

import java.awt.*;

public class WhiteBall extends Ball {
    public WhiteBall() {
        super(BallColor.WHITE, BallType.FULL, 0);
    }

    @Override
    public void onGoal() {
    }

    @Override
    public void render(Graphics2D g) {
    }

    @Override
    public String toString() {
        return "WhiteBall";
    }
}
