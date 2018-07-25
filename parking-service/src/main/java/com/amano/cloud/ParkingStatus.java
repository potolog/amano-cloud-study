package com.amano.cloud;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
public class ParkingStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String license;

    @Column(name = "inDate", nullable = false, updatable = false, insertable = true)
    private long inDate;

    private long outDate;

    @PrePersist
    void preInsert() {
        this.inDate = new Date().getTime();
    }

    private String parkingSector;

    private int floor;

    private boolean isUnderground;

    private boolean isMiddleLayer;

    private int parkingLotId;

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

    public long getInDate() {
        return inDate;
    }

    public void setInDate(long inDate) {
        this.inDate = inDate;
    }

    public long getOutDate() {
        return outDate;
    }

    public void setOutDate(long outDate) {
        this.outDate = outDate;
    }

    public String getParkingSector() {
        return parkingSector;
    }

    public void setParkingSector(String parkingSector) {
        this.parkingSector = parkingSector;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isUnderground() {
        return isUnderground;
    }

    public void setUnderground(boolean underground) {
        isUnderground = underground;
    }

    public boolean isMiddleLayer() {
        return isMiddleLayer;
    }

    public void setMiddleLayer(boolean middleLayer) {
        isMiddleLayer = middleLayer;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
