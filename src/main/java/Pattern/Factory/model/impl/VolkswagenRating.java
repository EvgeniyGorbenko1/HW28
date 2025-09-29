package Pattern.Factory.model.impl;

import Pattern.Factory.model.IRating;

public class VolkswagenRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm the best!!!");
    }
}
