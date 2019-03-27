package com.stackroute.BotService.service;

import com.stackroute.BotService.Domain.QueryData;
import com.stackroute.BotService.repository.QueryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryServiceImpl{


    private QueryRespository queryRespository;

    @Autowired
    public QueryServiceImpl(QueryRespository queryRespository) {
        this.queryRespository = queryRespository;
    }

    public QueryData saveQuery(QueryData queryData) {
        QueryData queryData1;
       queryData1= (QueryData) queryRespository.save(queryData);
       return queryData1;
    }
}
