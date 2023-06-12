package controllers;

import dtos.CreateParkingLotRequestDto;
import dtos.CreateParkingLotResponseDto;
import dtos.ResponseDto;
import models.ParkingLot;
import services.ParkingLotService;

public class ParkingLotController {
    private static ParkingLotService parkingLotService;

    // optional to init using the CTOR
    public ParkingLotController() {
        super();
        parkingLotService = new ParkingLotService();
    }

    public ResponseDto<CreateParkingLotResponseDto> createParkingLot(CreateParkingLotRequestDto request) {

        // get the parkingLot object from the Request-DTO + set create a new object with
        // the help of Service for creating a new object
        ParkingLot parkingLot = parkingLotService.createParkingLot(request.getAddress());

        // create a responseDto Object to
        CreateParkingLotResponseDto response = new CreateParkingLotResponseDto();
        response.setParkingLot(parkingLot);

        ResponseDto<CreateParkingLotResponseDto> baseResponse = new ResponseDto<>();
        baseResponse.setStatus("Success");
        baseResponse.setData(response);

        return baseResponse;
    }

}
