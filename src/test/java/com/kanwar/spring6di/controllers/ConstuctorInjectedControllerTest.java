package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstuctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}