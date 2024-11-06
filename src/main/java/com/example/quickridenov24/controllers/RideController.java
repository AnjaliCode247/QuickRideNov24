package com.example.quickridenov24.controllers;

import com.example.quickridenov24.dtos.ProposeRideRequestDto;
import com.example.quickridenov24.dtos.ProposeRideResponseDto;
import com.example.quickridenov24.exceptions.VehicleNotFoundException;
import com.example.quickridenov24.services.RideService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/rides/create

@RestController
@RequestMapping("/rides")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }


    @PostMapping("/create")
    public ProposeRideResponseDto proposeRide(ProposeRideRequestDto requestDto) throws VehicleNotFoundException {
        rideService.proposeRide(
                10L,
                "Delhi",
                "Mumbai",
                100L,
                2000,
                4
        );

        return null;
    }
}
