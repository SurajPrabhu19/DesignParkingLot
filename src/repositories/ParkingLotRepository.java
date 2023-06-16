package repositories;

import java.util.*;

import models.ParkingLot;

public class ParkingLotRepository {
    // this repo is used to connect to database and store the data or receive data
    // we are creating most of the things static since these are object agnostic
    // since we dont need a behaviour and feature for every object

    // private static List<ParkingLot> parkingLots;
    private static HashMap<Long, ParkingLot> parkingLots = new HashMap<>();
    private static long nextId = 0;

    // since below function is static we are not using constructor to avoid null ptr
    // exception
    // public ParkingLotRepository() {
    // if (parkingLots == null)
    // parkingLots = new HashMap<>();
    // }

    public static ParkingLot save(ParkingLot parkingLot) {
        parkingLot.setId(nextId);
        nextId += 1;

        // parkingLots.add(parkingLot);
        parkingLots.put(nextId, parkingLot);
        return parkingLot;
    }

    public static ParkingLot update(long id, ParkingLot updatedParkingLot) {
        parkingLots.put(id, updatedParkingLot);
        return updatedParkingLot;
    }

    public ParkingLot getParkingLotById(long id) {
        if (parkingLots.containsKey(id))
            return parkingLots.get(id);
        return null;
    }
}