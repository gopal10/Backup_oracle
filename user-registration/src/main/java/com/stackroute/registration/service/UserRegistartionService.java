package com.stackroute.registration.service;

import com.stackroute.registration.domain.UserRegistation;
import com.stackroute.registration.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistartionService implements UserRegistrationServiceImpl{

    @Autowired
    private UserRegistrationRepository userRegistrationRepository;

    @Override
    public UserRegistation saveUser(UserRegistation userRegistation) {
        return userRegistrationRepository.save(userRegistation);
    }
}
