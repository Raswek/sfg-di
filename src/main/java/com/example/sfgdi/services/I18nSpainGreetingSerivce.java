package com.example.sfgdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile({"SP"})
@Service("i18nGreeting")
public class I18nSpainGreetingSerivce implements GreetingService
{
    @Override
    public String greeting()
    {
        return "Boenos Dias";
    }
}
