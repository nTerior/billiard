package de.jepa.billiard.object;

import de.jepa.billiard.object.balls.Ball;
import de.jepa.billiard.util.math.Vec2d;

public enum StartingPosition {

    WHITE(new Vec2d(300, 500)),

    ONE(new Vec2d(300, 200)),
    TWO(new Vec2d(ONE.position.x - Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - Ball.PIXEL_DRAW_RADIUS)),
    THREE(new Vec2d(ONE.position.x - Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 2 * Ball.PIXEL_DRAW_RADIUS)),
    FOUR(new Vec2d(ONE.position.x - 3 * Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - 3 * Ball.PIXEL_DRAW_RADIUS)),
    FIVE(new Vec2d(ONE.position.x + 2 * Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 4 * Ball.PIXEL_DRAW_RADIUS)),
    SIX(new Vec2d(ONE.position.x - Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 4 * Ball.PIXEL_DRAW_RADIUS)),
    SEVEN(new Vec2d(ONE.position.x + Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - 3 * Ball.PIXEL_DRAW_RADIUS)),
    EIGHT(new Vec2d(ONE.position.x, ONE.position.y - 2 * Ball.PIXEL_DRAW_RADIUS)),
    NINE(new Vec2d(ONE.position.x + Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - Ball.PIXEL_DRAW_RADIUS)),
    TEN(new Vec2d(ONE.position.x + Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 2 * Ball.PIXEL_DRAW_RADIUS)),
    ELEVEN(new Vec2d(ONE.position.x + 3 * Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - 3 * Ball.PIXEL_DRAW_RADIUS)),
    TWELVE(new Vec2d(ONE.position.x - 2 * Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 4 * Ball.PIXEL_DRAW_RADIUS)),
    THIRTEEN(new Vec2d(ONE.position.x + Ball.PIXEL_DRAW_RADIUS, ONE.position.y - 4 * Ball.PIXEL_DRAW_RADIUS)),
    FOURTEEN(new Vec2d(ONE.position.x - Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y - 3 * Ball.PIXEL_DRAW_RADIUS)),
    FIFTEEN(new Vec2d(ONE.position.x, ONE.position.y - 4 * Ball.PIXEL_DRAW_RADIUS));

    Vec2d position;

    StartingPosition(Vec2d position) {
        this.position = position;
    }

    public Vec2d getPosition() {
        return position;
    }
}
