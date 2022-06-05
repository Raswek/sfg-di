package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest
{
    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp()
    {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());

        System.out.println(setterInjectionController.sayHallo());
    }

    @Test
    void sayHalloTest()
    {
        System.out.println(setterInjectionController.sayHallo());
        assertTrue(setterInjectionController.sayHallo().equalsIgnoreCase("Hallo Welt"));
    }
}