package de.jepa.billiard.io;

/*
 * By Paul Stier, 8/8/21
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInterrupts extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        Mouse.clickX = e.getX();
        Mouse.clickY = e.getY();

        Mouse.mouseClickListeners.forEach(l -> l.onClick(e.getX(), e.getY()));
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Mouse.dragDir.x = e.getX() - Mouse.dragStart.x;
        Mouse.dragDir.y = e.getY() - Mouse.dragStart.y;

        Mouse.mouseDragListeners.forEach(l -> l.onDrag(Mouse.dragStart, Mouse.dragDir));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Mouse.dragDir.x = 0;
        Mouse.dragDir.y = 0;

        if (e.getButton() == MouseEvent.BUTTON1) Mouse.leftButtonDown = true;
        if (e.getButton() == MouseEvent.BUTTON2) Mouse.middleButtonDown = true;
        if (e.getButton() == MouseEvent.BUTTON3) Mouse.rightButtonDown = true;

        Mouse.dragStart.x = e.getX();
        Mouse.dragStart.y = e.getY();
        Mouse.pressX = e.getX();
        Mouse.pressY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) Mouse.leftButtonDown = false;
        if (e.getButton() == MouseEvent.BUTTON2) Mouse.middleButtonDown = false;
        if (e.getButton() == MouseEvent.BUTTON3) Mouse.rightButtonDown = false;
        Mouse.releaseX = e.getX();
        Mouse.releaseY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Mouse.x = e.getX();
        Mouse.y = e.getY();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Mouse.onScreen = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Mouse.onScreen = false;
    }
}
