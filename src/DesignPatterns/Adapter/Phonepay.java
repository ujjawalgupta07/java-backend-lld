package DesignPatterns.Adapter;

public class Phonepay {

    private final BankApi bankApi;
    private final FastTagRecharge fastTagRecharge;
    private final BillPayment billPayment;

    public Phonepay(BankApi bankApi) {
        this.bankApi = bankApi;
        this.fastTagRecharge = new FastTagRecharge();
        this.billPayment = new BillPayment();
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(amount, bankApi);
    }

    public void payBill(int amount){
        billPayment.payBill(amount, bankApi);
    }
}
