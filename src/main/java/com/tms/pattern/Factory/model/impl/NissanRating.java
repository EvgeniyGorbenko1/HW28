package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.IRating;

public class NissanRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm good!");
    }
}
