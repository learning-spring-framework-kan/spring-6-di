package com.kanwar.spring6di.services;

import org.springframework.stereotype.Service;

@Service("badGreeting")
public class BadQualifiedGreetingServiceImpl implements GreetingService{


    @Override
    public String sayHello() {
        return "Hey! Why the heck you are in my face.";
    }
}
