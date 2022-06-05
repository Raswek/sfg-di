package com.example.sfgdi.controllers;

import org.springframework.stereotype.*;

@Controller
public class MyController
{

    public MyController()
    {
        System.out.println();
    }

    public String sayHallo()
    {
        System.out.println("MyController says Hallo");

        return "Hallo du auch";
    }
}
