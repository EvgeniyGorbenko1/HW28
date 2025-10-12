package com.tms.solid.DependencyInversionPrinciple;

public class NFCPay implements IPayments{
    @Override
    public void doTransfer(double amount) {
        System.out.println("Pay by NFC");
    }
}
