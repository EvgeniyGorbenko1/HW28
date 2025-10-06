package pattern.Factory.impl;

import pattern.Factory.ICarFactory;
import pattern.Factory.model.ICountry;
import pattern.Factory.model.IPrice;
import pattern.Factory.model.IRating;
import pattern.Factory.model.impl.*;

public class NissanCarFactory implements ICarFactory {
    public ICountry createCountry() {
        return new Japan();
    }

    public IPrice createPrice() {
        return new NissanPrice();
    }

    public IRating createRating() {
        return new NissanRating();
    }
}
