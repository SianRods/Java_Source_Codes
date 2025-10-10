package com.rods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection.xml");
        // Setting the values using getters and setters using the property tag and using the IoC
        Programmer p1 = (Programmer) context.getBean("programmer");
        Laptop l1 = (Laptop) context.getBean("laptop");

        System.out.println(p1.getComputer());
    }
}
