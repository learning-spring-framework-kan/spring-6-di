package com.kanwar.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from base impl class";
    }

}
