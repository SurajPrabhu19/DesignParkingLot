package strategies.spotAssigmentStrategy;

import models.EntryGate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.ParkingSpotStatus;
import models.VehicleType;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType, EntryGate entryGate) {

        for (ParkingFloor floors : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : floors.getParkingSpots()) {
                if (parkingSpot.getSpotType().toString().equals(vehicleType.toString())
                        && parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }

}
