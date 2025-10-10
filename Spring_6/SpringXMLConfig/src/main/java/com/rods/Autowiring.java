package com.rods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Programmer p1 = context.getBean("programmer", Programmer.class);
        p1.getComputer().compile();
    }

}
