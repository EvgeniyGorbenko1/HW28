package pattern.Factory.impl;

import pattern.Factory.ICarFactory;
import pattern.Factory.model.ICountry;
import pattern.Factory.model.IPrice;
import pattern.Factory.model.IRating;
import pattern.Factory.model.impl.*;

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
