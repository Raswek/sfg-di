package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class PropertyInjectionController
{
    @Autowired
    public GreetingService greetingService;

    public String sagHallo()
    {
        return greetingService.greeting();
    }
}
