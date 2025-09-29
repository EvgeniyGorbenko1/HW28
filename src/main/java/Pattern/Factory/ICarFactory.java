package Pattern.Factory;

import Pattern.Factory.model.ICountry;
import Pattern.Factory.model.IPrice;
import Pattern.Factory.model.IRating;

public interface ICarFactory {
    ICountry createCountry();
    IRating createRating();
    IPrice createPrice();

}
