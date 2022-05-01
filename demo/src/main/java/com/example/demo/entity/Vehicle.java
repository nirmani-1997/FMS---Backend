package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "vehicles")
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vehicleType;
    private String color;
    private String vehicleModel;
    private String plateNo;
    private String insuranceNo;
    private Date boughtDate;
    private Date serviceDate;
    private Date insuranceExpireDate;
    private boolean enabled = true;


    public Vehicle() {

    }


    public Vehicle(Long id, String vehicleType, String color, String vehicleModel, String plateNo, String insuranceNo, Date boughtDate, Date serviceDate, Date insuranceExpireDate, boolean enabled) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.color = color;
        this.vehicleModel = vehicleModel;
        this.plateNo = plateNo;
        this.insuranceNo = insuranceNo;
        this.boughtDate = boughtDate;
        this.serviceDate = serviceDate;
        this.insuranceExpireDate = insuranceExpireDate;
        this.enabled = enabled;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public Date getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(Date boughtDate) {
        this.boughtDate = boughtDate;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Date getInsuranceExpireDate() {
        return insuranceExpireDate;
    }

    public void setInsuranceExpireDate(Date insuranceExpireDate) {
        this.insuranceExpireDate = insuranceExpireDate;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}



