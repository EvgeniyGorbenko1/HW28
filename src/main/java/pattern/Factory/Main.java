package pattern.Factory;

import pattern.Factory.impl.NissanCarFactory;
import pattern.Factory.impl.PeugeotCarFactory;
import pattern.Factory.impl.VWCarFactory;
import pattern.Factory.model.ICountry;
import pattern.Factory.model.IPrice;
import pattern.Factory.model.IRating;

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
