package com.tms.pattern.decorator.model;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
