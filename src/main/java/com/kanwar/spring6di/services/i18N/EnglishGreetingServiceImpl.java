package com.kanwar.spring6di.services.i18N;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("i18N")
@Profile("EN")
public class EnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello there! - EN";
    }
}
