package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Set<Vehicle> getVehicles() {
        return new LinkedHashSet<>(this.vehicleRepository.findAll());
    }

    @Override
    public Vehicle getVehicle(Long vehicleId) {
        return this.vehicleRepository.findById(vehicleId).get();
    }

    @Override
    public void deleteVehicle(Long vehicleId) {

        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleId);
        this.vehicleRepository.delete(vehicle);
    }
}
