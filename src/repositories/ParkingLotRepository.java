package repositories;

import services.ParkingLotService;
import java.util.*;

import models.ParkingLot;

public class ParkingLotRepository {
    // this repo is used to connect to database and store the data or receive data

    private static List<ParkingLot> parkingLots;
    private static int nextId = 0;

    public static ParkingLot save(ParkingLot parkingLot) {
        parkingLot.setId(nextId);
        nextId += 1;

        parkingLots.add(parkingLot);
        return parkingLot;
    }
}