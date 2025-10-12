package com.tms.pattern.Factory;

import com.tms.pattern.Factory.impl.NissanCarFactory;
import com.tms.pattern.Factory.impl.PeugeotCarFactory;
import com.tms.pattern.Factory.impl.VWCarFactory;
import com.tms.pattern.Factory.model.ICountry;
import com.tms.pattern.Factory.model.IPrice;
import com.tms.pattern.Factory.model.IRating;

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
