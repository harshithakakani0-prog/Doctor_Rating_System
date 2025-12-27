package com.doctor.app.controller;

import com.doctor.app.entity.Location;
import com.doctor.app.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;
    @PostMapping("/create")
    public String createlocation(@RequestBody Location location){
        System.out.println("Location data="+location);
        locationRepository.save(location);
        return "location created";
    }
}
