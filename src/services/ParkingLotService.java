package services;

import dtos.CreateParkingLotRequestDto;
import models.ParkingLot;
import repositories.ParkingLotRepository;

// Task of this service is CREATE and UPDATE the Parking Lot Obj
public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    // private static ParkingLotRepository parkingLotRepository = new
    // ParkingLotRepository();

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        super();
        this.parkingLotRepository = parkingLotRepository;
    }

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

    public ParkingLot updateParkingLot(long id, String address) {
        ParkingLot updatedParkingLot = parkingLotRepository.getParkingLotById(id);

        if (updatedParkingLot != null)
            updatedParkingLot.setAddress(address);

        return ParkingLotRepository.update(id, updatedParkingLot);
    }
}
