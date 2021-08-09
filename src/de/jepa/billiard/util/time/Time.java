package de.jepa.billiard.util.time;

public class Time {
    public static void sleep(long startTime, long deltaTime) {
        while (System.currentTimeMillis() <= startTime + deltaTime) ;
    }
}