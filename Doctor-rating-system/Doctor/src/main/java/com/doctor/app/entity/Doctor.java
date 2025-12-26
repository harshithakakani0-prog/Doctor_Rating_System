package com.doctor.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    @NotBlank
    private String doctorName;
    @NotBlank
    private String specialization;
    @NotBlank
    private String experience;
    @Size(min = 10,max = 15)
    private String phonenumber;
    private double feestructure;
    @OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL,orphanRemoval = true)
    List<Location> locations=new ArrayList<>();
    @OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL,orphanRemoval = true)
    List<Rating> ratings=new ArrayList<>();

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public double getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(double feestructure) {
        this.feestructure = feestructure;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Doctor_Id=" + doctorId +
                ", Doctor_name='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experiance='" + experience + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", feestructure='" + feestructure + '\'' +
                '}';
    }
}
