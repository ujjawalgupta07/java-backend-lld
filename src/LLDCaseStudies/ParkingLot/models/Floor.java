package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private List<ParkingSlot> slots;
    int number;
    private Status floorStatus;

    public Floor(List<ParkingSlot> slots, int number, Status floorStatus) {
        this.slots = slots;
        this.number = number;
        this.floorStatus = floorStatus;
    }

    public Floor(int number, Status floorStatus) {
        this.slots = new ArrayList<>();
        this.number = number;
        this.floorStatus = floorStatus;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Status getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(Status floorStatus) {
        this.floorStatus = floorStatus;
    }
}
