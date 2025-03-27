package DesignPatterns.Strategy;

public class ParkingLot {

    private final SlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String generateTicket(){
        int slot = slotAllocationStrategy.generateSlot();
        return "Ticket for slot :: " + slot;
    }
}
