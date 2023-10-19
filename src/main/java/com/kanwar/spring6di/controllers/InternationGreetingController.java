package com.kanwar.spring6di.controllers;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InternationGreetingController {

    private final GreetingService greetingService;

    public InternationGreetingController(@Qualifier("i18N") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
