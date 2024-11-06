package com.example.quickridenov24.repositories;

import com.example.quickridenov24.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Override
    Optional<Vehicle> findById(Long vehicleId);
}
