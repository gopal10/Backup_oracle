package com.stackroute.registration.controller;

import com.stackroute.registration.domain.UserRegistation;
import com.stackroute.registration.service.UserRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserRegistrationController {

    private UserRegistrationServiceImpl userRegistrationService;
    @Autowired
    public UserRegistrationController(UserRegistrationServiceImpl userServiceImpl) {
        this.userRegistrationService = userServiceImpl;
    }

    @PostMapping("/registration")
    public ResponseEntity<UserRegistation> saveUser(@RequestBody UserRegistation userRegistation){
        return new ResponseEntity<UserRegistation>(userRegistrationService.saveUser(userRegistation),HttpStatus.CREATED);
    }
}
