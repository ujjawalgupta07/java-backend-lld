package LLDCaseStudies.ParkingLot.controller;

import LLDCaseStudies.ParkingLot.models.Gate;
import LLDCaseStudies.ParkingLot.models.ParkingLot;
import LLDCaseStudies.ParkingLot.models.Ticket;
import LLDCaseStudies.ParkingLot.models.Vehicle;
import LLDCaseStudies.ParkingLot.service.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket issueTicket(ParkingLot parkingLot, Gate gate, Vehicle vehicle) {
        return ticketService.issueTicket(parkingLot, gate, vehicle);
    }
}
