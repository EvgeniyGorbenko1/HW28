package pattern.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setBrand("Audi").setYear(1996).setPower(150).setMaxSpeed(280).build();
        Car car2 = new Car.Builder().setBrand("Ford").setYear(2004).setPower(100).setMaxSpeed(190).build();
        System.out.println(car2.getPower());
    }

}
