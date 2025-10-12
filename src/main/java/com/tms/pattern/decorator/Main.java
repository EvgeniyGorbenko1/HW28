package com.tms.pattern.decorator;

import com.tms.pattern.decorator.model.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        CircleDecorator decorator = new CircleDecorator(circle);

        circle.draw();
    }
}
