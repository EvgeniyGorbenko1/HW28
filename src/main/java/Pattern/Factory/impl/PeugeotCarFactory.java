package Pattern.Factory.impl;

import Pattern.Factory.ICarFactory;
import Pattern.Factory.model.ICountry;
import Pattern.Factory.model.IPrice;
import Pattern.Factory.model.IRating;
import Pattern.Factory.model.impl.*;

public class PeugeotCarFactory implements ICarFactory {
    public ICountry createCountry() {
        return new France();
    }

    public IPrice createPrice() {
        return new PeugeotPrice();
    }

    public IRating createRating() {
        return new PeugeotRating();
    }
}
