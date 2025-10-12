package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.IRating;

public class PeugeotRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm sad :c");
    }
}
