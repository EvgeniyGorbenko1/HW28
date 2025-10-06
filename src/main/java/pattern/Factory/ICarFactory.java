package pattern.Factory;

import pattern.Factory.model.ICountry;
import pattern.Factory.model.IPrice;
import pattern.Factory.model.IRating;

public interface ICarFactory {
    ICountry createCountry();
    IRating createRating();
    IPrice createPrice();

}
