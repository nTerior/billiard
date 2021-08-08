package de.jepa.billiard.game;

import de.jepa.billiard.camera.Camera;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game {

    private Camera camera;

    private Thread gameLoop;
    private boolean isRunning = false;

    public Game(){

    }


    private void initGame(){

    }

    private void startGame(){
        isRunning = true;
        run();
    }

    private void stopGame(){
        isRunning = false;
    }

    private void run(){
        gameLoop = new Thread(() -> {
            while(isRunning){
                tick();
                render();
            }
        });
    }

    private void tick(){

    }

    private void render(){
        BufferStrategy bufferStrategy = camera.getBufferStrategy();
        if (bufferStrategy == null) {
            camera.createBufferStrategy(3);
            return;
        }

        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();

        camera.render(g);

        g.dispose();
        bufferStrategy.show();
    }


}
