package DesignPatterns.Strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter slot type :: ");
        String type = sc.nextLine();
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationFactory.getSlotAllocationStrategyBySlotType(type);
        ParkingLot parkingLot = new ParkingLot(slotAllocationStrategy);
        System.out.println(parkingLot.generateTicket());

    }
}
