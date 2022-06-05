package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller("i18n")
public class I18nGreetingController
{
    GreetingService greetingService;

    public I18nGreetingController(@Qualifier("i18nGreeting") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public void sayHallo()
    {
        System.out.println(greetingService.greeting());
    }
}
