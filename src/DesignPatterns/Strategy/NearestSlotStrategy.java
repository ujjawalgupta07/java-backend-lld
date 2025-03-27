package DesignPatterns.Strategy;

public class NearestSlotStrategy implements SlotAllocationStrategy{
    @Override
    public int generateSlot() {
        return 10;
    }
}
