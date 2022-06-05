package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.springframework.stereotype.*;

@Controller
public class ConstrucktorInjectionController
{
    GreetingService greetingService;

    public ConstrucktorInjectionController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHallo()
    {
        return greetingService.greeting();
    }
}
