package com.example.sfgdi.services;

import org.springframework.stereotype.*;

@Service
public class PropertyGreetingServiceImpl implements GreetingService
{
    @Override
    public String greeting()
    {
        return "Hallo Welt - Property";
    }
}
