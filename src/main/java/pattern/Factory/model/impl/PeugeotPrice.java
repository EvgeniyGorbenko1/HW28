package pattern.Factory.model.impl;

import pattern.Factory.model.IPrice;

public class PeugeotPrice implements IPrice {
    @Override
    public void getPrice() {
        System.out.println("Price: 40000$");
    }
}
