package com.example.quickridenov24.services;

import com.example.quickridenov24.exceptions.VehicleNotFoundException;
import com.example.quickridenov24.models.Ride;
import com.example.quickridenov24.models.Vehicle;
import com.example.quickridenov24.repositories.DriverRepository;
import com.example.quickridenov24.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RideService {
    private VehicleRepository vehicleRepository;
    private DriverRepository driverRepository;


    public RideService(VehicleRepository vehicleRepository,
                       DriverRepository driverRepository) {
        this.vehicleRepository = vehicleRepository;
        this.driverRepository = driverRepository;
    }

    public Ride proposeRide(Long vehicleId,
                            String source,
                            String destination,
                            Long driverId,
                            double amount,
                            int availableSeatCounts) throws VehicleNotFoundException { // POJO

        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(vehicleId);

        if (optionalVehicle.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle with id : " + vehicleId + " not found, please first add your vehicle in the Database.");
        }


        // .....


        return new Ride();
    }
}
