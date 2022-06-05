package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		String s = myController.sayHallo();
		System.out.println(s);

		System.out.println("_________Property");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) applicationContext.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.sagHallo());

		System.out.println("_________Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) applicationContext.getBean("setterInjectionController");
		System.out.println(setterInjectionController.sayHallo());

		System.out.println("__________Construcktor");
		ConstrucktorInjectionController construcktorInjectionController = (ConstrucktorInjectionController) applicationContext.getBean("construcktorInjectionController");
		System.out.println(construcktorInjectionController.sayHallo());
	}

}
