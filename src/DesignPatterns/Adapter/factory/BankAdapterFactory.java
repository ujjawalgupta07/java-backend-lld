package DesignPatterns.Adapter.factory;

import DesignPatterns.Adapter.BankApi;
import DesignPatterns.Adapter.adapter.AxisBankAdapter;
import DesignPatterns.Adapter.adapter.IciciBankAdapter;

public class BankAdapterFactory {

    public static BankApi getBankApiByBankName(String bankName) {
        BankApi bankApi = null;
        if(bankName.equalsIgnoreCase("axis")){
            bankApi = new AxisBankAdapter();
        }
        else if(bankName.equalsIgnoreCase("icici")){
            bankApi = new IciciBankAdapter();
        }
        return bankApi;
    }
}
