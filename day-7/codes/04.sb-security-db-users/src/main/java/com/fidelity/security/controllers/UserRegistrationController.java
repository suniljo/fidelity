package com.fidelity.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.security.entities.MyUser;
import com.fidelity.security.repository.MyUserRepository;

@RestController
public class UserRegistrationController {
	
    @Autowired
    private MyUserRepository myUserRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    @PostMapping("/register/user")
    public MyUser createUser(@RequestBody MyUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        return myUserRepository.save(user);
    }   
}
