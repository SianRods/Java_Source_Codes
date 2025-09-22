package com.rods;

import com.rods.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Creating a new context with java-based-annotation of beans and injections
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Programmer p1 = context.getBean(Programmer.class);
        p1.code();
    }
}
