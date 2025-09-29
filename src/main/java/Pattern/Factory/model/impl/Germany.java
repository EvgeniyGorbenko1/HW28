package Pattern.Factory.model.impl;

import Pattern.Factory.model.ICountry;

public class Germany implements ICountry {
    @Override
    public void printCountry() {
        System.out.println("Created in Germany!");
    }
}
