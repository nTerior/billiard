package de.jepa.billiard.object;

import de.jepa.billiard.object.balls.Ball;
import de.jepa.billiard.util.math.Vec2d;

public enum StartingPosition {
    WHITE(new Vec2d(300, 200)),

    ONE(new Vec2d(300, 300)),
    TWO(new Vec2d(ONE.position.x + Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y + Ball.PIXEL_DRAW_RADIUS)),
    THREE(new Vec2d(TWO.position.x + Ball.PIXEL_DRAW_RADIUS / 2, TWO.position.y + Ball.PIXEL_DRAW_RADIUS)),
    FOUR(new Vec2d(THREE.position.x + Ball.PIXEL_DRAW_RADIUS / 2, THREE.position.y + Ball.PIXEL_DRAW_RADIUS)),
    FIVE(new Vec2d(FOUR.position.x + Ball.PIXEL_DRAW_RADIUS / 2, FOUR.position.y + Ball.PIXEL_DRAW_RADIUS)),

    SIX(new Vec2d(ONE.position.x - Ball.PIXEL_DRAW_RADIUS / 2, ONE.position.y + Ball.PIXEL_DRAW_RADIUS)),
    SEVEN(new Vec2d(SIX.position.x + Ball.PIXEL_DRAW_RADIUS / 2, SIX.position.y + Ball.PIXEL_DRAW_RADIUS)),
    EIGHT(new Vec2d(SEVEN.position.x + Ball.PIXEL_DRAW_RADIUS / 2, SEVEN.position.y + Ball.PIXEL_DRAW_RADIUS)),
    NINE(new Vec2d(EIGHT.position.x + Ball.PIXEL_DRAW_RADIUS / 2, EIGHT.position.y + Ball.PIXEL_DRAW_RADIUS)),

    TEN(new Vec2d(SIX.position.x - Ball.PIXEL_DRAW_RADIUS / 2, SIX.position.y + Ball.PIXEL_DRAW_RADIUS)),
    ELEVEN(new Vec2d(TEN.position.x + Ball.PIXEL_DRAW_RADIUS / 2, TEN.position.y + Ball.PIXEL_DRAW_RADIUS)),
    TWELVE(new Vec2d(ELEVEN.position.x + Ball.PIXEL_DRAW_RADIUS / 2, ELEVEN.position.y + Ball.PIXEL_DRAW_RADIUS)),

    THIRTEEN(new Vec2d(TEN.position.x - Ball.PIXEL_DRAW_RADIUS / 2, TEN.position.y + Ball.PIXEL_DRAW_RADIUS)),
    FOURTEEN(new Vec2d(THIRTEEN.position.x + Ball.PIXEL_DRAW_RADIUS / 2, THIRTEEN.position.y + Ball.PIXEL_DRAW_RADIUS)),

    FIFTEEN(new Vec2d(THIRTEEN.position.x - Ball.PIXEL_DRAW_RADIUS / 2, THIRTEEN.position.y + Ball.PIXEL_DRAW_RADIUS));

    /* ONE(new Vec2d(100, 100)),
    TWO(new Vec2d(110, 120)),
    THREE(new Vec2d(120, 140)),
    FOUR(new Vec2d(130, 160)),
    FIVE(new Vec2d(140, 180)),
    SIX(new Vec2d(90, 120)),
    SEVEN(new Vec2d(100, 140)),
    EIGHT(new Vec2d(110, 160)),
    NINE(new Vec2d(120, 180)),
    TEN(new Vec2d(80, 140)),
    ELEVEN(new Vec2d(90, 160)),
    TWELVE(new Vec2d(100, 180)),
    THIRTEEN(new Vec2d(70, 160)),
    FOURTEEN(new Vec2d(80, 180)),
    FIFTEEN(new Vec2d(60, 180)); */

    Vec2d position;

    StartingPosition(Vec2d position) {
        this.position = position;
    }

    public Vec2d getPosition() {
        return position;
    }
}
