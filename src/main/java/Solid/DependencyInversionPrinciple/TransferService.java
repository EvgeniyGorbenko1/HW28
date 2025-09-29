package Solid.DependencyInversionPrinciple;

public class TransferService {
    private final IPayments iPayments;

    public TransferService(IPayments iPayments) {
        this.iPayments = iPayments;
    }

    public void chooseTransfer() {
        iPayments.doTransfer(2);


    }
}
