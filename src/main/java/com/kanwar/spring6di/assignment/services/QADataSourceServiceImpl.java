package com.kanwar.spring6di.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QADataSourceServiceImpl implements IdentifyDataSourceService {

    @Override
    public String getDataSourceName() {
        return "QUALITY ASSURANCE - DB";
    }
}
