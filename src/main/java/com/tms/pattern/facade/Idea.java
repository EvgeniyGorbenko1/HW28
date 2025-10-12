package com.tms.pattern.facade;

public class Idea extends Laptop{
    @Override
    public void start() {
        System.out.println("Idea start");
    }

    @Override
    public void stop() {
        System.out.println("Idea stop");
    }
}
