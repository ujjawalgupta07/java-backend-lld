package LLDCaseStudies.ParkingLot.models;

public class Ticket {

    private int id;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private String entryTime;
    private Gate gate;
    private Operator operator;

    public Ticket(int id, Vehicle vehicle, ParkingSlot parkingSlot, String entryTime, Gate gate, Operator operator) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
        this.gate = gate;
        this.operator = operator;
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

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
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
}
