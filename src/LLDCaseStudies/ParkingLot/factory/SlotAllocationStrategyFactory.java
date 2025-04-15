package LLDCaseStudies.ParkingLot.factory;

import LLDCaseStudies.ParkingLot.Strategies.FarthestSlotAllocationStrategy;
import LLDCaseStudies.ParkingLot.Strategies.NearestSlotAllocationStrategy;
import LLDCaseStudies.ParkingLot.Strategies.ParkingSlotAllocationStrategy;
import LLDCaseStudies.ParkingLot.Strategies.RandomSlotAllocationStrategy;
import LLDCaseStudies.ParkingLot.enums.SlotAllocationStrategies;

public class SlotAllocationStrategyFactory {

    public static ParkingSlotAllocationStrategy getStrategy(SlotAllocationStrategies strategy){
        if(strategy.equals(SlotAllocationStrategies.NEAREST)){
            return new NearestSlotAllocationStrategy();
        }
        else if (strategy.equals(SlotAllocationStrategies.FARTHEST)){
            return new FarthestSlotAllocationStrategy();
        }

        return new RandomSlotAllocationStrategy();
    }
}
