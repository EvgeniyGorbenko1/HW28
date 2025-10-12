package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.IPrice;

public class NissanPrice implements IPrice {
    @Override
    public void getPrice() {
        System.out.println("Price: 80000$");
    }
}
