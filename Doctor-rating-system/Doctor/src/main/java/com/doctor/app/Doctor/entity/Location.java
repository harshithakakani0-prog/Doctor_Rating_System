package com.doctor.app.Doctor.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;
    private String city;
    private String street;
    private String pincode;
    @OneToMany(mappedBy = "Location")
    private List<Doctor> doctors;

    public int getLocation_id() {
        return locationId;
    }

    public void setLocation_id(int locationId) {
        this.locationId = locationId;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + locationId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
