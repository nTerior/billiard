package de.jepa.billiard.io;

import de.jepa.billiard.io.events.MouseClick;
import de.jepa.billiard.io.events.MouseDrag;
import de.jepa.billiard.io.events.MousePostDrag;
import de.jepa.billiard.util.math.Vec2i;

import java.util.ArrayList;

/*
 * Copyright by Paul Stier, 2021
 */
public class Mouse {
    protected static ArrayList<MouseDrag> mouseDragListeners = new ArrayList<>();
    protected static ArrayList<MousePostDrag> mousePostDragListeners = new ArrayList<>();
    protected static ArrayList<MouseClick> mouseClickListeners = new ArrayList<>();

    public static int x = 0;
    public static int y = 0;
    public static int clickX = 0;
    public static int clickY = 0;
    public static int pressX = 0;
    public static int pressY = 0;
    public static int releaseX = 0;
    public static int releaseY = 0;

    public static boolean rightButtonDown = false;
    public static boolean middleButtonDown = false;
    public static boolean leftButtonDown = false;

    public static boolean onScreen = false;

    public static Vec2i dragStart = new Vec2i();
    public static Vec2i dragDir = new Vec2i();
    public static boolean dragging = false;

    public static void addClickListener(MouseClick click) {
        mouseClickListeners.add(click);
    }
    public static void removeClickListener(MouseClick click) {
        mouseClickListeners.remove(click);
    }

    public static void addDragListener(MouseDrag drag) {
        mouseDragListeners.add(drag);
    }
    public static void removeDragListener(MouseDrag drag) {
        mouseDragListeners.remove(drag);
    }

    public static void addPostDragListener(MousePostDrag drag) {
        mousePostDragListeners.add(drag);
    }
    public static void removePostDragListener(MousePostDrag drag) {
        mousePostDragListeners.remove(drag);
    }
}
