package DesignPatterns.Adapter;

import DesignPatterns.Adapter.factory.BankAdapterFactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter payment bank ");
        String paymentBank = sc.nextLine();
        BankApi bankApi = BankAdapterFactory.getBankApiByBankName(paymentBank);
        Phonepay phonepay = new Phonepay(bankApi);
        phonepay.payBill(100);
        phonepay.rechargeFastTag(50);

    }
}
