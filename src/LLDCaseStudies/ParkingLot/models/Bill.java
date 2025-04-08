package LLDCaseStudies.ParkingLot.models;

import java.util.List;

public class Bill {

    private int id;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private String exitTime;
    private Gate gate;
    private Operator operator;
    private List<Payment> payment;

    public Bill(int id, Vehicle vehicle, ParkingSlot parkingSlot, String exitTime, Gate gate, Operator operator, List<Payment> payment) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
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
