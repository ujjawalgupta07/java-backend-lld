package DesignPatterns.Adapter.adapter;

import DesignPatterns.Adapter.BankApi;
import DesignPatterns.Adapter.BankApis.IciciBankApi;

public class IciciBankAdapter implements BankApi {

    private final IciciBankApi iciciBankApi = new IciciBankApi();

    @Override
    public int checkBalance() {
        return iciciBankApi.fetchBalance();
    }

    @Override
    public void makePayment(int amount) {
         iciciBankApi.transferMoney(amount);
    }
}
