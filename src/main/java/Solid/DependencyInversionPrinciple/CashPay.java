package Solid.DependencyInversionPrinciple;

public class CashPay implements IPayments{
    @Override
    public void doTransfer(double amount) {
        System.out.println("Pay by Cash");
    }
}
