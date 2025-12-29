package com.doctor.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private int doctorId;

    @NotBlank
    @Column(name = "doctor_name")
    private String doctorName;

    @NotBlank
    private String specialization;

    @NotBlank
    private String experience;

    @Size(min = 10, max = 15)
    private String phonenumber;

    private double feestructure;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Rating> ratings = new ArrayList<>();

    // ---------- GETTERS & SETTERS ----------

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
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience='" + experience + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", feestructure=" + feestructure +
                ", ratings=" + ratings +
                '}';
    }
}
