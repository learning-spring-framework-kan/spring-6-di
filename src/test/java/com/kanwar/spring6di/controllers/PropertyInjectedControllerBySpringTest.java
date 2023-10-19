package com.kanwar.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerBySpringTest {

    @Autowired
    PropertyInjectedControllerBySpring controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}