package pattern.Factory.model.impl;

import pattern.Factory.model.ICountry;

public class France implements ICountry {
    @Override
    public void printCountry() {
        System.out.println("Created in France!");
    }
}
