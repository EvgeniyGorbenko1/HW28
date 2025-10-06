package pattern.decorator;

import pattern.decorator.model.Shape;

public class ShapeDecorator implements Shape {
    private Shape shape;
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {

    }
}
