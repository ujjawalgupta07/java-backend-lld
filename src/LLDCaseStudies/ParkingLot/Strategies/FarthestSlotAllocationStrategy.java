package LLDCaseStudies.ParkingLot.Strategies;

import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.models.Floor;
import LLDCaseStudies.ParkingLot.models.ParkingLot;
import LLDCaseStudies.ParkingLot.models.ParkingSlot;
import LLDCaseStudies.ParkingLot.models.Vehicle;

import java.util.List;

public class FarthestSlotAllocationStrategy implements ParkingSlotAllocationStrategy {

    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, Vehicle vehicle) {
        List<Floor> floors = parkingLot.getFloors();
        int numberOfFloors = floors.size();
        System.out.println("Number of floors: " + numberOfFloors);
        Floor allotedFloor = null;
        for(int i = numberOfFloors-1 ; i >= 0; i--){
            Floor floor = floors.get(i);
            if(floor.getFloorStatus().equals(Status.VACANT) && floor.getSupportedVehicleType().equals(vehicle.getVehicleType())){
                allotedFloor = floor;
                break;
            }
        }

        if(allotedFloor == null){
            System.out.println("No Slots available!!!!! Please come back later !!!!");
            return null;
        }

        List<ParkingSlot> parkingSlotsOnAllotedFloor = allotedFloor.getSlots();
        int numberOFSlotsOnAllotedFloor = parkingSlotsOnAllotedFloor.size();
        for(int i = numberOFSlotsOnAllotedFloor-1 ; i >= 0; i--){
            ParkingSlot parkingSlot = parkingSlotsOnAllotedFloor.get(i);
            if(parkingSlot.getSlotStatus().equals(Status.VACANT)){
                return parkingSlot;
            }
        }

        return null;
    }
}