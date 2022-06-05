package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.springframework.stereotype.*;

@Controller
public class MyController
{
    GreetingService greetingService;

    public MyController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHallo()
    {
        return greetingService.greeting();
    }
}
