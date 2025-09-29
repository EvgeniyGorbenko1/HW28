package Pattern.Factory.impl;

import Pattern.Factory.ICarFactory;
import Pattern.Factory.model.ICountry;
import Pattern.Factory.model.IPrice;
import Pattern.Factory.model.IRating;
import Pattern.Factory.model.impl.*;

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
