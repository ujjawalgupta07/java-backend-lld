package LLDCaseStudies.ParkingLot.service;

import LLDCaseStudies.ParkingLot.Strategies.ParkingSlotAllocationStrategy;
import LLDCaseStudies.ParkingLot.enums.SlotAllocationStrategies;
import LLDCaseStudies.ParkingLot.factory.SlotAllocationStrategyFactory;
import LLDCaseStudies.ParkingLot.models.*;

import java.time.LocalDateTime;

public class TicketService {

    public Ticket issueTicket(ParkingLot parkingLot, Gate gate , Vehicle vehicle) {

        SlotAllocationStrategies slotAllocationStrategies = SlotAllocationStrategies.FARTHEST;
        ParkingSlotAllocationStrategy parkingSlotAllocationStrategy =
                SlotAllocationStrategyFactory.getStrategy(slotAllocationStrategies);

        ParkingSlot allotedSlot = parkingSlotAllocationStrategy.allocateSlot(parkingLot, vehicle);

        return new Ticket(vehicle, allotedSlot, LocalDateTime.now().toString(), gate, gate.getOperator());
    }
}
