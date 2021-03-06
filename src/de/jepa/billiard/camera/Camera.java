package de.jepa.billiard.camera;

/*
 * By Paul Stier, 8/8/21
 */

import de.jepa.billiard.game.Game;
import de.jepa.billiard.io.MouseInterrupts;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.object.balls.Ball;
import de.jepa.billiard.util.time.Time;
import de.jepa.billiard.window.Window;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class Camera extends Canvas {

    public static final HUD hud = new HUD();
    private final long RENDER_TIME = (long) (1000D / 60);
    private ArrayList<Ball> bufferList;

    public Camera() {
        initCamera();
    }

    private void initCamera() {
        MouseInterrupts mouseInterrupts = new MouseInterrupts();
        addMouseListener(mouseInterrupts);
        addMouseMotionListener(mouseInterrupts);

        setBounds(new Rectangle(0, 0, Window.SIZE.x, Window.SIZE.y));
        setBackground(Color.DARK_GRAY);
    }

    public void startRendering() {
        startRenderLoop();
    }

    private void startRenderLoop() {
        new Thread(() -> {
            long deltaTime = System.currentTimeMillis();
            while (Game.isRunning()) {
                long startTime = System.currentTimeMillis();
                deltaTime = System.currentTimeMillis() - deltaTime;
                render();
                Time.sleep(startTime, RENDER_TIME);
            }
        }).start();
    }

    private void render() {
        BufferStrategy bufferStrategy = this.getBufferStrategy();

        if (bufferStrategy == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g.clearRect(0, 0, getWidth(), getHeight());
        render(g);

        g.dispose();
        bufferStrategy.show();
    }

    private void render(Graphics2D g) {
        bufferList = BallManager.getCurrentState();
        hud.renderDrag(g);
        BallManager.render(g, bufferList);
        hud.render(g);
    }
}
