package com.doctor.app.controller;

import com.doctor.app.entity.Doctor;
import com.doctor.app.entity.Rating;
import com.doctor.app.entity.User;
import com.doctor.app.repository.DoctorRepository;
import com.doctor.app.repository.RatingRepository;
import com.doctor.app.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@Valid @RequestBody Rating rating) {

        // 1️⃣ Validate Doctor ID
        if (rating.getDoctor() == null || rating.getDoctor().getDoctorId() <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Doctor ID is required"
            );
        }

        // 2️⃣ Validate User ID
        if (rating.getUser() == null || rating.getUser().getUserId() <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "User ID is required"
            );
        }

        // 3️⃣ Fetch Doctor
        Doctor doctor = doctorRepository.findById(
                rating.getDoctor().getDoctorId()
        ).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Doctor not found"
        ));

        // 4️⃣ Fetch User
        User user = userRepository.findById(
                rating.getUser().getUserId()
        ).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "User not found"
        ));

        // 5️⃣ Attach managed entities
        rating.setDoctor(doctor);
        rating.setUser(user);

        // 6️⃣ Save Rating
        Rating savedRating = ratingRepository.save(rating);

        return new ResponseEntity<>(savedRating, HttpStatus.CREATED);
    }
}
