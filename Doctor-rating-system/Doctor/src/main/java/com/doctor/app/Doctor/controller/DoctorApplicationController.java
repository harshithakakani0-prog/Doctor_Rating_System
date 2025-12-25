package com.doctor.app.Doctor.controller;

import com.doctor.app.Doctor.entity.Doctor;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorApplicationController {
    @GetMapping("greetDoctor")
    public String greetDoctor(){
        return "Hello Doctor";
    }
    @PostMapping("createDoctor")
    public String createdoctor(@RequestBody Doctor doctor){
        System.out.println("Doctor data "+doctor.toString());
        return "doctor created";
    }
    @GetMapping("readDoctor")
    public String readdoctor(@RequestParam("id") int Doctor_Id){
        System.out.println("Doctor+Id "+Doctor_Id);
        return "Doctor reading completed";
    }
}
