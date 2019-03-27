package com.stackroute.BotService.repository;

import com.stackroute.BotService.Domain.QueryData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueryRespository extends MongoRepository<QueryData, String> {
}
