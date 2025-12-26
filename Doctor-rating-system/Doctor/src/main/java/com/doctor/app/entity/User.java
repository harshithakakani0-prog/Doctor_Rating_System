package com.doctor.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    @NotBlank
    private String name;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    @Size(min=10, max=15)
    private String phonenumber;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phonenumber;
    }

    public void setPhone_number(String phone_number) {
        this.phonenumber = phone_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_ID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phonenumber + '\'' +
                '}';
    }
}
