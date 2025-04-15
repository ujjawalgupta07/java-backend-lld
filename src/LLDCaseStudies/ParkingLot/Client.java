package LLDCaseStudies.ParkingLot;

import LLDCaseStudies.ParkingLot.controller.TicketController;
import LLDCaseStudies.ParkingLot.enums.GateType;
import LLDCaseStudies.ParkingLot.enums.Status;
import LLDCaseStudies.ParkingLot.enums.VehicleType;
import LLDCaseStudies.ParkingLot.models.*;
import LLDCaseStudies.ParkingLot.service.TicketService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();
        TicketController ticketController = new TicketController(ticketService);

        ParkingLot parkingLot =
                new ParkingLot("123 Baker Street", 20);
        List<Gate> gates = new ArrayList<>();
        List<Floor> floors = new ArrayList<>();

        Operator entryGateOperator = new Operator("Akash", 35);
        Operator exitGateOperator = new Operator("Atul", 36);

        gates.add(new Gate("1A", entryGateOperator, GateType.ENTRY));
        gates.add(new Gate("2A", exitGateOperator, GateType.EXIT));

        floors.add(new Floor("0", Status.VACANT, 7, VehicleType.TWO_WHEELER));
        floors.add(new Floor("1", Status.VACANT,7, VehicleType.FOUR_WHEELER));
        floors.add(new Floor("2", Status.VACANT,6, VehicleType.FOUR_WHEELER));

        floors.sort(Comparator.comparingInt(f -> Integer.parseInt(f.getNumber())));

        parkingLot.setGates(gates);
        parkingLot.setFloors(floors);

        Vehicle vehicle = new Vehicle("abc-123-12", "Ujjawal", VehicleType.TWO_WHEELER);

        Ticket issuedTicket = ticketController.issueTicket(parkingLot, gates.getFirst(), vehicle);

        System.out.println(issuedTicket.getVehicle().getOwnerName() + "'s " + issuedTicket.getVehicle().getVehicleType() + " with license plate :: " +
                issuedTicket.getVehicle().getVehicleNumber() + " entered Parking lot from Gate :: " + issuedTicket.getGate().getNumber()
                + " at :: " + issuedTicket.getEntryTime());
        System.out.println("The Alloted Slot is :: " + issuedTicket.getParkingSlot().getNumber());

    }
}
