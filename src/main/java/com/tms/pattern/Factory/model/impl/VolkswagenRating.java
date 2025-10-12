package com.tms.pattern.Factory.model.impl;

import com.tms.pattern.Factory.model.IRating;

public class VolkswagenRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm the best!!!");
    }
}
