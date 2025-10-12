package com.tms.pattern.Factory.impl;

import com.tms.pattern.Factory.ICarFactory;
import com.tms.pattern.Factory.model.ICountry;
import com.tms.pattern.Factory.model.IPrice;
import com.tms.pattern.Factory.model.IRating;
import com.tms.pattern.Factory.model.impl.*;

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
