package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.ICountry;

public class Germany implements ICountry {
    @Override
    public void printCountry() {
        System.out.println("Created in Germany!");
    }
}
