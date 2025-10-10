package com.rods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter_injection.xml");
        // Setting the values using getters and setters using the property tag and using the IoC
        Programmer p1 = (Programmer) context.getBean("programmer");
        Laptop l1 = (Laptop) context.getBean("laptop");
        l1.setBrand("Apple");
        l1.setRam(32);
        // Set the values by using setAttribute()
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getComputer());
    }
}
