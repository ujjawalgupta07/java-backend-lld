package LLDCaseStudies.ParkingLot.Strategies;

import LLDCaseStudies.ParkingLot.models.ParkingLot;
import LLDCaseStudies.ParkingLot.models.ParkingSlot;
import LLDCaseStudies.ParkingLot.models.Vehicle;

public interface ParkingSlotAllocationStrategy {

    ParkingSlot allocateSlot(ParkingLot parkingLot, Vehicle vehicle);
}
