package com.example.sfgdi.services;

import org.springframework.stereotype.*;

@Service
public class SetterGreetingServiceImpl implements GreetingService
{
    @Override
    public String greeting()
    {
        return "Hallo Welt - Setter";
    }
}
