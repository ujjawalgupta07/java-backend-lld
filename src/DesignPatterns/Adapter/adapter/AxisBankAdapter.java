package DesignPatterns.Adapter.adapter;

import DesignPatterns.Adapter.BankApi;
import DesignPatterns.Adapter.BankApis.AxisBankApi;

public class AxisBankAdapter implements BankApi {

    private final AxisBankApi axisBankApi = new AxisBankApi();

    @Override
    public int checkBalance() {
        return axisBankApi.checkBalance();
    }

    @Override
    public void makePayment(int amount) {
        axisBankApi.makePayment(amount);
    }
}
