package com.example.mapAPI.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double latitude;
    private double longitude;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double imei;

    public Position() {
    }

    public Position(double latitude, double longitude, Date date, double imei) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.imei = imei;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getImei() {
        return imei;
    }

    public void setImei(double imei) {
        this.imei = imei;
    }
}
