package com.kanwar.spring6di.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class PRODDataSourceServiceImpl implements IdentifyDataSourceService {

    @Override
    public String getDataSourceName() {
        return "PRODUCTION - DB";
    }
}
