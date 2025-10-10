package com.rods;

import com.rods.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Creating a new context with java-based-annotation of beans and injections
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Programmer p1 = context.getBean(Programmer.class);
        Programmer p2 = context.getBean(Programmer.class);
        p1.code();

        System.out.println("Setting the age using annotations " + p1.getAge());
        /*
        Always remember even if the bean is marked as primary even then
        the qualifier has more priority over the primary markings
         */
    }
}
