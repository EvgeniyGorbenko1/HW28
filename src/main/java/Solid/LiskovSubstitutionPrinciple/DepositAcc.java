package Solid.LiskovSubstitutionPrinciple;

public class DepositAcc extends ParkingAcc{
    @Override
    public void balance(int ParkingAccNumber) {
        super.balance(ParkingAccNumber);
    }

    @Override
    public void deposit(int ParkingAccNumber, int DepositAmount) {
        super.deposit(ParkingAccNumber, DepositAmount);
    }
}
