package LLDCaseStudies.ParkingLot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int id;
    List<Gate> gates;
    List<Floor> floors;
    String address;
    int capacity;

    public ParkingLot(int id, List<Gate> gates, List<Floor> floors, String address, int capacity) {
        this.id = id;
        this.gates = gates;
        this.floors = floors;
        this.address = address;
        this.capacity = capacity;
    }

    public ParkingLot(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        this.gates = new ArrayList<>();
        this.floors = new ArrayList<>();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
