package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest
{

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp()
    {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new ConstructorGreetingServiceImpl();

        System.out.println(propertyInjectionController.sagHallo());
    }

    @Test
    void greetingTest()
    {
        System.out.println(propertyInjectionController.sagHallo());
        assertTrue(propertyInjectionController.sagHallo().equalsIgnoreCase("Hallo Welt"));
    }
}