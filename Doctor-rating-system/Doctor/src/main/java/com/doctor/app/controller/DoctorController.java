package com.doctor.app.controller;

import com.doctor.app.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/search/name")
    public List<Doctor> searchByName(@RequestParam String name) {
        return doctorService.searchByName(name);
    }

    @GetMapping("/search/specialization")
    public List<Doctor> searchBySpecialization(@RequestParam String specialization) {
        return doctorService.searchBySpecialization(specialization);
    }

    @GetMapping("/search/city")
    public List<Doctor> searchByCity(@RequestParam String city) {
        return doctorService.searchByCity(city);
    }

    @GetMapping("/search/specialization-city")
    public List<Doctor> searchBySpecializationAndCity(@RequestParam String specialization,
                                                      @RequestParam String city) {
        return doctorService.searchBySpecializationAndCity(specialization, city);
    }
}


