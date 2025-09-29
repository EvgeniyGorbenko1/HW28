package Pattern.Factory.model.impl;

import Pattern.Factory.model.IRating;

public class PeugeotRating implements IRating {
    @Override
    public void showRating() {
        System.out.println("I'm sad :c");
    }
}
