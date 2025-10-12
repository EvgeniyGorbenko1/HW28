package com.tms.solid.InterfaceSegregationPrinciple;



public class TerminalPayment implements IPayCreditCard, IPayNFC {
    @Override
    public void payCreditCard() {

    }

    @Override
    public void payNFC() {

    }
}
