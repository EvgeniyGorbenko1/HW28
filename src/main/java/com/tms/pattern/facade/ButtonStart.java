package com.tms.pattern.facade;

public class ButtonStart extends Laptop {
    @Override
    public void start() {
        System.out.println("Laptop start");
    }

    @Override
    public void stop() {
        System.out.println("Laptop stop");
    }
}
