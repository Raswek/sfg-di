package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class SetterInjectionController
{
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHallo()
    {
        return greetingService.greeting();
    }
}
