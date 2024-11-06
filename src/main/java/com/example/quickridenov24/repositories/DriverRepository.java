package com.example.quickridenov24.repositories;

import com.example.quickridenov24.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Override
    Optional<Driver> findById(Long driverId);
}
