package com.example.sfgdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String greeting()
    {
        return "Greeting nicht spezifiziert, bitte Quolifire benutzen";
    }
}
