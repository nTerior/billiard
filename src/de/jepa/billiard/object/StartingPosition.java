package de.jepa.billiard.object;

import de.jepa.billiard.util.math.Vec2d;

public enum StartingPosition {
    WHITE(new Vec2d(500, 500)),
    ONE(new Vec2d(100, 100)),
    TWO(new Vec2d(105, 110)),
    THREE(new Vec2d(110, 120)),
    FOUR(new Vec2d(115, 130)),
    FIVE(new Vec2d(120, 140)),
    SIX(new Vec2d(95, 110)),
    SEVEN(new Vec2d(100, 120)),
    EIGHT(new Vec2d(105, 130)),
    NINE(new Vec2d(110, 140)),
    TEN(new Vec2d(90, 120)),
    ELEVEN(new Vec2d(95, 130)),
    TWELVE(new Vec2d(100, 140)),
    THIRTEEN(new Vec2d(85, 130)),
    FOURTEEN(new Vec2d(90, 140)),
    FIFTEEN(new Vec2d(80, 140));

    Vec2d position;

    StartingPosition(Vec2d position) {
        this.position = position;
    }

    public Vec2d getPosition() {
        return position;
    }
}
