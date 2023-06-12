package dtos;

import models.ParkingLot;

public class CreateParkingLotResponseDto {
    private ParkingLot parkingLot;
    private ResponseStatusDto responseStatus;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ResponseStatusDto getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusDto responseStatus) {
        this.responseStatus = responseStatus;
    }

}
