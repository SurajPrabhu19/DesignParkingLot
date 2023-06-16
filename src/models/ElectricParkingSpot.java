package models;

public class ElectricParkingSpot extends BaseModel {

    private ParkingSpot parkingSpot; // added during Schema design - this makes code more simpler
    private ElectricCharger electricCharger;

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }
}
