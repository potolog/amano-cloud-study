package com.amano.cloud;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String license;

    private String color;

    private String vehicleMaker;

    private String vehicleModel;

    private String vehicleType;

    private boolean regular;

    private long regularRegistrationDate;

    private long regularExpireDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleMaker() {
        return vehicleMaker;
    }

    public void setVehicleMaker(String vehicleMaker) {
        this.vehicleMaker = vehicleMaker;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public long getRegularRegistrationDate() {
        return regularRegistrationDate;
    }

    public void setRegularRegistrationDate(long regularRegistrationDate) {
        this.regularRegistrationDate = regularRegistrationDate;
    }

    public long getRegularExpireDate() {
        return regularExpireDate;
    }

    public void setRegularExpireDate(long regularExpireDate) {
        this.regularExpireDate = regularExpireDate;
    }
}
