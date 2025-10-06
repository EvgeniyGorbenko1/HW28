package pattern.decorator;

import pattern.decorator.model.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        CircleDecorator decorator = new CircleDecorator(circle);

        circle.draw();
    }
}
`