package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.PaymentMode;
import LLDCaseStudies.ParkingLot.enums.PaymentStatus;

public class Payment {

    private int amount;
    private String date;
    private PaymentStatus status;
    private PaymentMode mode;

    public Payment(int amount, String date, PaymentStatus status, PaymentMode mode) {
        this.amount = amount;
        this.date = date;
        this.status = status;
        this.mode = mode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
}
