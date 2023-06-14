package strategies.spotAssigmentStrategy;

import models.EntryGate;
import models.ParkingLot;
import models.ParkingSpot;
import models.VehicleType;

public interface SpotAssignmentStrategy {
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType, EntryGate entryGate);
}
