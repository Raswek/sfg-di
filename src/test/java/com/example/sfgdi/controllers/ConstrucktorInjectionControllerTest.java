package com.example.sfgdi.controllers;

import com.example.sfgdi.services.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ConstrucktorInjectionControllerTest
{

    ConstrucktorInjectionController construcktorInjectionController;

    @BeforeEach
    void setUp()
    {
        construcktorInjectionController = new ConstrucktorInjectionController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void testSayHallo()
    {
        assertTrue(construcktorInjectionController.sayHallo().equalsIgnoreCase("Hallo Welt"));
    }
}