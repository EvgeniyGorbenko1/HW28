package com.tms.pattern.Factory.impl;

import com.tms.pattern.Factory.ICarFactory;
import com.tms.pattern.Factory.model.ICountry;
import com.tms.pattern.Factory.model.IPrice;
import com.tms.pattern.Factory.model.IRating;
import com.tms.pattern.Factory.model.impl.*;

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
