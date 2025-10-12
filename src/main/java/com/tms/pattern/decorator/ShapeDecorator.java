package com.tms.pattern.decorator;

import com.tms.pattern.decorator.model.Shape;

public class ShapeDecorator implements Shape {
    private Shape shape;
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {

    }
}
