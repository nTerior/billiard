package de.jepa.billiard.game;

import de.jepa.billiard.camera.Camera;
import de.jepa.billiard.object.BallManager;
import de.jepa.billiard.util.time.Time;
import de.jepa.billiard.window.Window;


public class Game {

    private final long TICK_TIME = (long) (1000D / 180);

    private Window window;
    private Camera camera;

    private static boolean isRunning = false;

    public Game() {
        initGame();
        startGame();
    }


    private void initGame() {
        window = new Window();
        camera = new Camera();
        window.add(camera);
    }

    private void startGame() {
        isRunning = true;
        run();
        camera.startRendering();
    }

    private void stopGame() {
        isRunning = false;
    }

    private void run() {
        new Thread(() -> {
            long deltaTime = System.currentTimeMillis();
            while (isRunning) {
                long startTime = System.currentTimeMillis();
                deltaTime = System.currentTimeMillis() - deltaTime;
                tick(deltaTime);
                Time.sleep(startTime,TICK_TIME);
            }
        }).start();
    }

    private void tick(long deltaTime) {
        BallManager.moveBalls(deltaTime);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private void sleep(long startTime) {
        while (System.currentTimeMillis() <= startTime + TICK_TIME) ;
    }

    public static boolean isRunning() {
        return isRunning;
    }
}
