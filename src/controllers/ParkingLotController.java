package controllers;

import dtos.CreateParkingLotRequestDto;
import dtos.CreateParkingLotResponseDto;
import dtos.ResponseDto;
import dtos.UpdateParkingLotRequestDto;
import dtos.UpdateParkingLotResponseDto;
import models.ParkingLot;
import services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    // optional to init using the CTOR
    public ParkingLotController(ParkingLotService parkingLotService) {
        super();
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDto createParkingLot(CreateParkingLotRequestDto request) {

        // get the parkingLot object from the Request-DTO + set create a new object with
        // the help of Service for creating a new object
        ParkingLot parkingLot = parkingLotService.createParkingLot(request.getAddress());

        // create a responseDto Object to return it to the client
        CreateParkingLotResponseDto response = new CreateParkingLotResponseDto();
        response.setParkingLot(parkingLot);

        // ResponseDto<CreateParkingLotResponseDto> baseResponse = new ResponseDto<>();
        // baseResponse.setStatus("Success");
        // baseResponse.setData(response);

        return response;
    }

    public UpdateParkingLotResponseDto updateParkingLot(UpdateParkingLotRequestDto request) {
        ParkingLot updatedParkingLot = parkingLotService.updateParkingLot(request.getId(), request.getAddress());

        UpdateParkingLotResponseDto response = new UpdateParkingLotResponseDto();
        response.setParkingLot(updatedParkingLot);
        return response;
    }

}
