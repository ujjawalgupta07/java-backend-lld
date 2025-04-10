package LLDCaseStudies.ParkingLot.models;

import java.util.List;

public class Bill {

    private int id;
    private Ticket ticket;
    private String exitTime;
    private Gate gate;
    private Operator operator;
    private List<Payment> payment;

    public Bill(int id, Ticket ticket, String exitTime, Gate gate, Operator operator, List<Payment> payment) {
        this.id = id;
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.gate = gate;
        this.operator = operator;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
