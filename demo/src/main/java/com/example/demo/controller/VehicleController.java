package com.example.demo.controller;


import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {


    @Autowired
    private VehicleService vehicleService;


    //add vehicle
    @PostMapping("/")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
        Vehicle vehicle1 = this.vehicleService.addVehicle(vehicle);
        return ResponseEntity.ok(vehicle1);
    }

    //get vehicle
    @GetMapping("/{vehicleId}")
    public Vehicle getVehicle(@PathVariable("vehicleId") Long vehicleId){
        return this.vehicleService.getVehicle(vehicleId);
    }

    //get all vehicles
    @GetMapping("/")
    public ResponseEntity<?> getVehicles(){
        return ResponseEntity.ok(this.vehicleService.getVehicles());
    }

    //update vehicle
    @PutMapping("/")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle){
        return this.vehicleService.updateVehicle(vehicle);
    }

    //delete vehicle
    @DeleteMapping("/{vehicleId}")
    public void deleteVehicle(@PathVariable("vehicleId") Long vehicleId){
        this.vehicleService.deleteVehicle(vehicleId);
    }


}
