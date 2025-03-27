package DesignPatterns.Strategy;

public class RandomSlotStrategy implements SlotAllocationStrategy{
    @Override
    public int generateSlot() {
        return 5;
    }
}
