package com.doctor.app.entity;

import jakarta.persistence.*;
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    private String doctorName;
    private String specialization;
    private String experiance;
    private String phonenumber;
    private String feestructure;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(String feestructure) {
        this.feestructure = feestructure;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Doctor_Id=" + doctorId +
                ", Doctor_name='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experiance='" + experiance + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", feestructure='" + feestructure + '\'' +
                '}';
    }
}
