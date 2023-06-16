package services;

import models.EntryGate;
import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import models.VehicleType;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import strategies.spotAssigmentStrategy.SpotAssignmentStrategy;

public class TicketService {

    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository,
            SpotAssignmentStrategy spotAssignmentStrategy) {
        super();
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public Ticket generateTicket(long parkingLotId, EntryGate entryGate, Vehicle vehicle, VehicleType vehicleType,
            String ownerName) {
        // init + set the ticket object:
        Ticket ticket = new Ticket();

        // create parking lot:
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);

        // create parking spot:
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLot, vehicleType, entryGate);

        // no parking slot found:
        if (parkingLot == null)
            return null;

        ticket.setParkingLot(parkingLot);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOwnerName(ownerName);
        ticket.setVehicle(vehicle);
        ticket.setGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());

        // store in database:
        ticketRepository.save(ticket);

        return ticket;
    }

}
