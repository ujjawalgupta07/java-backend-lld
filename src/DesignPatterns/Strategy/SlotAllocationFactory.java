package DesignPatterns.Strategy;

public class SlotAllocationFactory {
    
    public static SlotAllocationStrategy getSlotAllocationStrategyBySlotType(String slotType) {
        switch (slotType) {
            case "nearest" -> {
                return new NearestSlotStrategy();
            }
            case "farthest" -> {
                return new FarthestSlotStrategy();
            }
            case "random" -> {
                return new RandomSlotStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
