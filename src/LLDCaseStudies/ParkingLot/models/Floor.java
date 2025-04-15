package LLDCaseStudies.ParkingLot.models;

import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Floor extends BaseModel {

    private List<ParkingSlot> slots;
    private String number;
    private Status floorStatus;
    private int numberOfSlotsOnFloor;
    private VehicleType supportedVehicleType;

    public Floor(String number, Status floorStatus, int numberOfSlotsOnFloor, VehicleType vehicleType) {
        this.slots = new ArrayList<>();
        this.number = number;
        this.floorStatus = floorStatus;
        this.numberOfSlotsOnFloor = numberOfSlotsOnFloor;
        this.supportedVehicleType = vehicleType;

       for(int i = 0 ; i < numberOfSlotsOnFloor; i++){
           slots.add(new ParkingSlot(number + "-" + i, vehicleType));
       }
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

    public int getNumberOfSlotsOnFloor() {
        return numberOfSlotsOnFloor;
    }

    public void setNumberOfSlotsOnFloor(int numberOfSlotsOnFloor) {
        this.numberOfSlotsOnFloor = numberOfSlotsOnFloor;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

}
