package com.tms.pattern.Factory.impl;

import com.tms.pattern.Factory.ICarFactory;
import com.tms.pattern.Factory.model.ICountry;
import com.tms.pattern.Factory.model.IPrice;
import com.tms.pattern.Factory.model.IRating;
import com.tms.pattern.Factory.model.impl.Germany;
import com.tms.pattern.Factory.model.impl.VolkswagenPrice;
import com.tms.pattern.Factory.model.impl.VolkswagenRating;

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
