package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.enums.VehicleType;

public class ParkingSlot extends BaseModel{

    private String number;
    private VehicleType allowedVehicleType;
    private Status slotStatus;

    public ParkingSlot(String number, VehicleType allowedVehicleType) {
        this.number = number;
        this.allowedVehicleType = allowedVehicleType;
        this.slotStatus = Status.VACANT;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getSupportType() {
        return allowedVehicleType;
    }

    public void setSupportType(VehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public Status getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(Status slotStatus) {
        this.slotStatus = slotStatus;
    }

    public boolean isAvailable() {
        if(this.slotStatus.equals(Status.VACANT)){
            return true;
        }
        return false;
    }

    public void markOccupied(){
        this.slotStatus = Status.OCCUPIED;
    }

    public void markVacant(){
        this.slotStatus = Status.VACANT;
    }
}
