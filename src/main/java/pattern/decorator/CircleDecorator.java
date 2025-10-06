package pattern.decorator;

import pattern.decorator.model.Shape;

public class CircleDecorator extends ShapeDecorator {
    public CircleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("This is a red circle");
    }
}
