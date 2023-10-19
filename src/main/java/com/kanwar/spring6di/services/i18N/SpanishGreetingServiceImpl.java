package com.kanwar.spring6di.services.i18N;

import com.kanwar.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("i18N")
@Profile({"ES", "default"})
public class SpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
