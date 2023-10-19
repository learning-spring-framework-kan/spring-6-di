package com.kanwar.spring6di.assignment.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ActiveProfiles({"prod", "EN"})
class DatabaseIdentifierControllerTest {

    @Autowired
    DatabaseIdentifierController controller;

    @Test
    void dataSource() {
        System.out.println(controller.dataSource());
    }
}