package de.jepa.billiard.io.events;

import de.jepa.billiard.util.math.Vec2i;

/*
 * Copyright by Paul Stier, 2021
 */
public interface MouseDrag {
    void onDrag(Vec2i dragStart, Vec2i dragDir);
}
