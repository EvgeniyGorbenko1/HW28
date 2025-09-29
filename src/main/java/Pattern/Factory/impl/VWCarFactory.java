package Pattern.Factory.impl;

import Pattern.Factory.ICarFactory;
import Pattern.Factory.model.ICountry;
import Pattern.Factory.model.IPrice;
import Pattern.Factory.model.IRating;
import Pattern.Factory.model.impl.Germany;
import Pattern.Factory.model.impl.VolkswagenPrice;
import Pattern.Factory.model.impl.VolkswagenRating;

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
