package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.enums.VehicleType;

public class ParkingSlot {

    private String number;
    private VehicleType supportType;
    private Status slotStatus;

    public ParkingSlot(String number, VehicleType supportType, Status slotStatus) {
        this.number = number;
        this.supportType = supportType;
        this.slotStatus = slotStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getSupportType() {
        return supportType;
    }

    public void setSupportType(VehicleType supportType) {
        this.supportType = supportType;
    }

    public Status getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(Status slotStatus) {
        this.slotStatus = slotStatus;
    }
}
