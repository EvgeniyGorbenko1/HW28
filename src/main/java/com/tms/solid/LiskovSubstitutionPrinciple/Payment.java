package com.tms.solid.LiskovSubstitutionPrinciple;

public class Payment extends PaymentService{
    @Override
    public void payment(int ParkingAccNumber, int DepositAmount) {
        super.payment(ParkingAccNumber, DepositAmount);
    }

    @Override
    public void deposit(int ParkingAccNumber, int DepositAmount) {
        super.deposit(ParkingAccNumber, DepositAmount);
    }

    @Override
    public void balance(int ParkingAccNumber) {
        super.balance(ParkingAccNumber);
    }
}
