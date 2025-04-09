package LLDCaseStudies.ParkingLot.service.interfaces;

import DesignPatterns.Strategy.ParkingLot;

public interface ParkingLotService {

    ParkingLot createParkingLot(int numberOfGates, int numberOfFloors, String address, int capacity);
    ParkingLot updateParkingLot(int parkingLotId, int numberOfGates, int numberOfFloors, String address, int capacity);
    ParkingLot getParkingLot(int id);
    boolean deleteParkingLot(int id);

}
