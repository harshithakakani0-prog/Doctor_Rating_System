package com.doctor.app.controller;

import com.doctor.app.entity.Doctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorApplicationController {
    @GetMapping("/greet")
    public String greetDoctor(){
        return "Hello Doctor";
    }
    @PostMapping("/create")
    public String createdoctor(@RequestBody Doctor doctor){
        System.out.println("Doctor data "+doctor);
        return "doctor created";
    }
    @GetMapping("/read")
    public String readdoctor(@RequestParam("id") int Doctor_Id){
        System.out.println("Doctor+Id "+Doctor_Id);
        return "Doctor reading completed";
    }
}
