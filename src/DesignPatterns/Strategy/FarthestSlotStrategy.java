package DesignPatterns.Strategy;

public class FarthestSlotStrategy implements SlotAllocationStrategy{

    @Override
    public int generateSlot() {
        return 100;
    }
}

