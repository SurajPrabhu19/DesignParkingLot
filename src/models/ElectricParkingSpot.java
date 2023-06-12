package models;

public class ElectricParkingSpot extends BaseModel {

    private ParkingSpot parkingSpot;
    private ElectricCharger electricCharger;

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }
}
