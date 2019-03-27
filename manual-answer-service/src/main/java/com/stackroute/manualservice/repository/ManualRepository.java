package com.stackroute.manualservice.repository;

import com.stackroute.manualservice.domain.UserQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManualRepository extends MongoRepository<UserQuery,String> {
}
