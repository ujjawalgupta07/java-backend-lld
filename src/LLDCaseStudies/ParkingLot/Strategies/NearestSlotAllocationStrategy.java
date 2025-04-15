package LLDCaseStudies.ParkingLot.Strategies;


import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.models.Floor;
import LLDCaseStudies.ParkingLot.models.ParkingLot;
import LLDCaseStudies.ParkingLot.models.ParkingSlot;
import LLDCaseStudies.ParkingLot.models.Vehicle;

import java.util.List;

public class NearestSlotAllocationStrategy implements ParkingSlotAllocationStrategy {

    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, Vehicle vehicle) {
        List<Floor> floors = parkingLot.getFloors();
        Floor allotedFloor = null;
        for(Floor floor : floors){
            if(floor.getFloorStatus().equals(Status.VACANT) && floor.getSupportedVehicleType().equals(vehicle.getVehicleType())){
                allotedFloor = floor;
            }
        }

        if(allotedFloor == null){
            System.out.println("No Slots available!!!!! Please come back later !!!!");
            return null;
        }

        List<ParkingSlot> parkingSlotsOnAllotedFloor = allotedFloor.getSlots();
        for(ParkingSlot parkingSlot : parkingSlotsOnAllotedFloor){
            if(parkingSlot.getSlotStatus().equals(Status.VACANT)){
                return parkingSlot;
            }
        }

        return null;

    }
}
