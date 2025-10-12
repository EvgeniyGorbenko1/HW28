package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.ICountry;

public class Japan implements ICountry {
    @Override
    public void printCountry() {
        System.out.println("Created in Japan!");
    }
}
