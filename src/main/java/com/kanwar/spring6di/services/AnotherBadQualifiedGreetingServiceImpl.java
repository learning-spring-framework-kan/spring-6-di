package com.kanwar.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("getLost")
public class AnotherBadQualifiedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hey! Get Lost!";
    }
}
