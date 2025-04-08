package LLDCaseStudies.ParkingLot.models;

import java.util.List;

public class ParkingLot {

    List<Gate> gates;
    List<Floor> floors;
    String address;
    int capacity;

    public ParkingLot(List<Gate> gates, List<Floor> floors, String address, int capacity) {
        this.gates = gates;
        this.floors = floors;
        this.address = address;
        this.capacity = capacity;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
