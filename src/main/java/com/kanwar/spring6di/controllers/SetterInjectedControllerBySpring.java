package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedControllerBySpring {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("getLost")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }

}
