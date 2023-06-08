package models;

public class ParkingSpot extends BaseModel {

    private int spotNumber;
    private ParkingFloor parkingFloors;
    private SpotType spotType;
    private ParkingSpotStatus parkingSpotStatus;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(ParkingFloor parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

}
