package LLDCaseStudies.ParkingLot.Strategies;

import LLDCaseStudies.ParkingLot.models.ParkingSlot;

public interface ParkingSlotAllocationStrategy {

    ParkingSlot allocate(ParkingSlot slot);
}
