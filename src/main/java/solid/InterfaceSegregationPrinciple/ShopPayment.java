package solid.InterfaceSegregationPrinciple;



public class ShopPayment implements IPayCash, IPayNFC, IPayCreditCard {
    @Override
    public void payCash() {

    }

    @Override
    public void payCreditCard() {

    }

    @Override
    public void payNFC() {

    }
}
