package com.tms.solid.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        TransferService transferService = new TransferService(new CashPay());
        transferService.chooseTransfer();
    }
}
