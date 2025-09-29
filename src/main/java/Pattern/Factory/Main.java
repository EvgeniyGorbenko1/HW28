package Pattern.Factory;

import Pattern.Factory.impl.NissanCarFactory;
import Pattern.Factory.impl.PeugeotCarFactory;
import Pattern.Factory.impl.VWCarFactory;
import Pattern.Factory.model.ICountry;
import Pattern.Factory.model.IPrice;
import Pattern.Factory.model.IRating;

public class Main {
    public static void main(String[] args) {
        String request = "Peugeot";
        ICarFactory factory;

        switch (request) {
            case "Volkswagen" -> factory = new VWCarFactory();
            case "Nissan" -> factory = new NissanCarFactory();
            case "Peugeot" -> factory = new PeugeotCarFactory();
            default -> factory = new NissanCarFactory();
        }
        ICountry country = factory.createCountry();
        country.printCountry();
        IPrice price = factory.createPrice();
        price.getPrice();
        IRating rating = factory.createRating();
        rating.showRating();

    }
}
