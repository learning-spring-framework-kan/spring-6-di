package com.kanwar.spring6di.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DEVDataSourceServiceImpl implements IdentifyDataSourceService {

    @Override
    public String getDataSourceName() {
        return "DEVELOPMENT - DB";
    }
}
