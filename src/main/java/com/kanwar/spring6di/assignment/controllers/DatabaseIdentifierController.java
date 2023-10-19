package com.kanwar.spring6di.assignment.controllers;

import com.kanwar.spring6di.assignment.services.IdentifyDataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DatabaseIdentifierController {

    private final IdentifyDataSourceService identifyDataSourceService;

    public DatabaseIdentifierController(IdentifyDataSourceService identifyDataSourceService) {
        this.identifyDataSourceService = identifyDataSourceService;
    }

    public String dataSource(){
        return identifyDataSourceService.getDataSourceName();
    }
}
