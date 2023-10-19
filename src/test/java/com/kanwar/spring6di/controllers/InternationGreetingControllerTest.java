package com.kanwar.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({"EN", "qa"})
class InternationGreetingControllerTest {

    @Autowired
    InternationGreetingController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}