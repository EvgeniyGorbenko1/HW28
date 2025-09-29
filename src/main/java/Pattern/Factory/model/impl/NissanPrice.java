package Pattern.Factory.model.impl;

import Pattern.Factory.model.IPrice;

public class NissanPrice implements IPrice {
    @Override
    public void getPrice() {
        System.out.println("Price: 80000$");
    }
}
