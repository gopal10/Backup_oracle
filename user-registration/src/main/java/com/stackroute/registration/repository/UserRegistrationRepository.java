package com.stackroute.registration.repository;

import com.stackroute.registration.domain.UserRegistation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistation,Integer> {
}
