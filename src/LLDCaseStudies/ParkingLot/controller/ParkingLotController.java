package LLDCaseStudies.ParkingLot.controller;

import DesignPatterns.Strategy.ParkingLot;
import LLDCaseStudies.ParkingLot.service.interfaces.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot createParkingLot(){
        int numberOfGates = 2;
        int numberOfFloors = 4;
        String address = "123 Baker Street";
        int capacity = 200;
        return parkingLotService.createParkingLot(numberOfGates, numberOfFloors, address, capacity);
    }

    public ParkingLot updateParkingLot(){
        int parkingLotId = 1;
        int numberOfGates = 2;
        int numberOfFloors = 4;
        String address = "123 Baker Street";
        int capacity = 200;
        return parkingLotService.updateParkingLot(parkingLotId, numberOfGates, numberOfFloors, address, capacity);
    }

    ParkingLot getParkingLot(){
        return null;
    }

    public boolean deleteParkingLot(){
        return false;
    }
}
