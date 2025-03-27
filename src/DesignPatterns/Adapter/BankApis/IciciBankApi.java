package DesignPatterns.Adapter.BankApis;

public class IciciBankApi {

    public int fetchBalance() {
        System.out.println("Returning balance from Icici Bank");
        return 100;
    }

    public void transferMoney(int amount) {
        System.out.println("Making payment from Icici Bank");
    }
}
