package com.doctor.app.controller;

import com.doctor.app.entity.User;
import com.doctor.app.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/greet")
    public String greetuser(){
        return "Hello user";
    }
    @PostMapping("/create")
    public String createuser(@Valid @RequestBody User user){
        System.out.println("user data "+user);
        userRepository.save(user);
        return "user created";
    }
}
