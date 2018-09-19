package com.test.Methods;

public class Pause {

    public void userDelay(int time) {
        try {Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace(); }
    }
}
