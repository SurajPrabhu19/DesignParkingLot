package controllers;

import dtos.GenerateTicketRequestDto;
import dtos.GenerateTicketResponseDto;
import dtos.ResponseStatusDto;
import models.Ticket;
import services.TicketService;

public class TicketController {
    /*
     * private Date entryTime;
     * private Vehicle vehicle;
     * private ParkingSpot parkingSpot;
     * private Operator generatedBy;
     * 
     * private ParkingLot parkingLot;
     * private EntryGate entryGate;
     * private String ownerName;
     */

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        super();
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request) {
        Ticket ticket = ticketService.generateTicket(request.getParkingLotId(), request.getEntryGate(),
                request.getVehicle(), request.getVehicle().getVehicleType(), request.getOwnerName());

        GenerateTicketResponseDto response = new GenerateTicketResponseDto();
        response.setTicket(ticket);
        response.setStatus(ResponseStatusDto.SUCCESS);
        return response;
    }
}