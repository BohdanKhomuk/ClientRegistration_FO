package org.habr.springaspectj.services;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingService {

    public static final String HELLO_FROM_GREETING_SERVICE = "Hello from Greeting Service";

    public String sayHello() {
        return HELLO_FROM_GREETING_SERVICE;
    }

}