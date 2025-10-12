package com.tms.pattern.Factory;

import com.tms.pattern.Factory.model.ICountry;
import com.tms.pattern.Factory.model.IPrice;
import com.tms.pattern.Factory.model.IRating;

public interface ICarFactory {
    ICountry createCountry();
    IRating createRating();
    IPrice createPrice();

}
