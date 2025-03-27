package DesignPatterns.Adapter;

public class BillPayment {

    public void payBill(int amount, BankApi bankApi){
        if(bankApi.checkBalance() >= amount){
            System.out.println("Payment successful");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}
