package com.stackroute.registration.service;

import com.stackroute.registration.domain.UserRegistation;

public interface UserRegistrationServiceImpl {
    UserRegistation saveUser(UserRegistation userRegistation);
}
