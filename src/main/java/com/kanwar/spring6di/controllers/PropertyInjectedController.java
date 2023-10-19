package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
