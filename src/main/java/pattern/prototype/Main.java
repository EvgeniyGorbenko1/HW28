package pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("green", 120);
        Apple appleCloned = (Apple) apple.clone();

        System.out.println(appleCloned.getColor());
        System.out.println(appleCloned.getWeight());

    }
}
