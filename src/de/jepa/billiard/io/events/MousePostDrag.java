package de.jepa.billiard.io.events;

import de.jepa.billiard.util.math.Vec2i;

/*
 * Copyright by Paul Stier, 2021
 */
public interface MousePostDrag {
    void postDrag(Vec2i dragStartPos, Vec2i dragEndPos, Vec2i totalDrag);
}
