package Pattern.Factory.model.impl;

import Pattern.Factory.model.ICountry;

public class Japan implements ICountry {
    @Override
    public void printCountry() {
        System.out.println("Created in Japan!");
    }
}
