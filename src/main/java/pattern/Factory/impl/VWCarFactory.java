package pattern.Factory.impl;

import pattern.Factory.ICarFactory;
import pattern.Factory.model.ICountry;
import pattern.Factory.model.IPrice;
import pattern.Factory.model.IRating;
import pattern.Factory.model.impl.Germany;
import pattern.Factory.model.impl.VolkswagenPrice;
import pattern.Factory.model.impl.VolkswagenRating;

public class VWCarFactory implements ICarFactory {
    public ICountry createCountry() {
        return new Germany();
    }

    public IPrice createPrice() {
        return new VolkswagenPrice();
    }

    public IRating createRating() {
        return new VolkswagenRating();
    }
}
