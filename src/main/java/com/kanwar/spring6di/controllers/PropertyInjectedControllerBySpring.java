package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedControllerBySpring {

    @Autowired
    @Qualifier("badGreeting")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }


}
