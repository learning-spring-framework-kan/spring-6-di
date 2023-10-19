package com.kanwar.spring6di.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class UATDataSourceServiceImpl implements IdentifyDataSourceService {

    @Override
    public String getDataSourceName() {
        return "USER ACCEPTANCE TESTING - DB";
    }
}
