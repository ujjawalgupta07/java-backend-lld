package DesignPatterns.Adapter.BankApis;

public class AxisBankApi {

    public int checkBalance() {
        System.out.println("Returning balance from AxisBank");
        return 100;
    }

    public void makePayment(int amount) {
        System.out.println("Making payment from AxisBank");
    }
}
