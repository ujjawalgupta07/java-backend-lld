package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Floor extends BaseModel{

    private List<ParkingSlot> slots;
    private String number;
    private Status floorStatus;

    public Floor(List<ParkingSlot> slots, String number, Status floorStatus) {
        this.slots = slots;
        this.number = number;
        this.floorStatus = floorStatus;
    }

    public Floor(String number, Status floorStatus) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Status getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(Status floorStatus) {
        this.floorStatus = floorStatus;
    }
}
