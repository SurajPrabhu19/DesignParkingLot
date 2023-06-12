package services;

import dtos.CreateParkingLotRequestDto;
import models.ParkingLot;
import repositories.ParkingLotRepository;

public class ParkingLotService {
    private static ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingLot createParkingLot(String address) {
        // (create new object + init the object) + save to database + return the same
        // object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(address);

        // once a new object is created -> you save it to the database
        // i.e the repository.
        // you connect to the Database using the Repository.
        ParkingLot savedParkingLot = ParkingLotRepository.save(parkingLot);

        return savedParkingLot;
    }
}
