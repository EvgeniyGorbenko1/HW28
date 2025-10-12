package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.IPrice;

public class PeugeotPrice implements IPrice {
    @Override
    public void getPrice() {
        System.out.println("Price: 40000$");
    }
}
