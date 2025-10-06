package pattern.Factory.model.impl;

import pattern.Factory.model.IRating;

public class VolkswagenRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm the best!!!");
    }
}
