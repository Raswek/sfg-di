package com.example.sfgdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile({"EN","default"})
@Service("i18nGreeting")
public class I18nEnglishGreetingService implements GreetingService
{
    @Override
    public String greeting()
    {
        return "Hallo";
    }
}
