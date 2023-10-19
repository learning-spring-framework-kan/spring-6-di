package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedControllerBySpring {

    private final GreetingService greetingService;


    public ConstructorInjectedControllerBySpring(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
