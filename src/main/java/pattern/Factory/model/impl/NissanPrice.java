package pattern.Factory.model.impl;

import pattern.Factory.model.IPrice;

public class NissanPrice implements IPrice {
    @Override
    public void getPrice() {
        System.out.println("Price: 80000$");
    }
}
