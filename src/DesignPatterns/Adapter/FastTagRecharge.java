package DesignPatterns.Adapter;

public class FastTagRecharge {

    public void recharge(int amount, BankApi bankApi){
        if(bankApi.checkBalance() >= amount){
            System.out.println("Recharge successful");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}
