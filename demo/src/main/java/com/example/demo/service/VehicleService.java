package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface VehicleService {

    public Vehicle addVehicle(Vehicle vehicle);

    public Vehicle updateVehicle(Vehicle vehicle);

    public Set<Vehicle> getVehicles();

    public Vehicle getVehicle(Long vehicleId);

    public void deleteVehicle(Long vehicleId );
}
