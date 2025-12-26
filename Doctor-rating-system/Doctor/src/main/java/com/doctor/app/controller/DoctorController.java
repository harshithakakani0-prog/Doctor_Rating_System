package com.doctor.app.controller;

import com.doctor.app.entity.Doctor;
import com.doctor.app.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/greet")
    public String greetDoctor(){
        return "Hello Doctor";
    }

    @PostMapping("/create")
    public String createdoctor(@RequestBody Doctor doctor){
        System.out.println("Doctor data = " + doctor);
        doctorRepository.save(doctor);
        return "doctor created";
    }

    @GetMapping("/read")
    public String readdoctor(@RequestParam("id") int doctorId){
        System.out.println("Doctor Id = " + doctorId);
        return "Doctor reading completed";
    }
}

