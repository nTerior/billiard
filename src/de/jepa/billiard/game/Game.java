package de.jepa.billiard.game;

import de.jepa.billiard.camera.Camera;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.window.Window;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game {

    private final long TICK_TIME = (long) (1000D / 60);

    private Camera camera;

    private Thread gameLoop;
    private boolean isRunning = false;

    public Game() {
        new Window();
        initGame();
    }


    private void initGame() {
        startGame();
    }

    private void startGame() {
        isRunning = true;
        run();
    }

    private void stopGame() {
        isRunning = false;
    }

    private void run() {
        gameLoop = new Thread(() -> {
            long deltaTime = System.currentTimeMillis();
            while (isRunning) {
                long startTime = System.currentTimeMillis();
                deltaTime = System.currentTimeMillis() - deltaTime;
                tick(deltaTime);
                render();
                sleep(startTime);
            }
        });
    }

    private void tick(long deltaTime) {
        BallManager.moveBalls(deltaTime);
    }

    private void render() {
        BufferStrategy bufferStrategy;
        do {
            bufferStrategy = camera.getBufferStrategy();
            camera.createBufferStrategy(3);
        } while (bufferStrategy == null);

        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();

        camera.render(g);

        g.dispose();
        bufferStrategy.show();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private void sleep(long startTime) {
        while (System.currentTimeMillis() <= startTime + TICK_TIME) ;
    }
}
