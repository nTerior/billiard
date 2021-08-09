package de.jepa.billiard.util.time;

public class Time {
    @SuppressWarnings("StatementWithEmptyBody")
    public static void sleep(long startTime, long deltaTime) {
        while (System.currentTimeMillis() <= startTime + deltaTime) ;
    }
}