package pattern.builder;

public class Car {
    private String brand;
    private int year;
    private int power;
    private int maxSpeed;

    public static class Builder {
        private Car car;

        public Builder() {
            car = new Car();
        }

        public Builder setBrand(String brand) {
            car.brand = brand;
            return this;
        }

        public Builder setYear(int year) {
            car.year = year;
            return this;
        }

        public Builder setPower(int power) {
            car.power = power;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            car.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return car;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

