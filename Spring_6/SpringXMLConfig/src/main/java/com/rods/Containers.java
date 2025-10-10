package com.rods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.channels.OverlappingFileLockException;

/**
 * Hello world!
 */
public class Containers {
    public static void main(String[] args) {
        // creating a new container
        // we have to mention the file path for configuring the spring and
        // beans creation inside of it
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_cfg.xml");

        //  requesting the programmer object from the spring container
        Programmer p1 = (Programmer) context.getBean("programmer");
        p1.setName("Programmer_1");

        System.out.println(p1.getName());
        Programmer p2 = (Programmer) context.getBean("programmer");
        System.out.println(p2.getName());

        // Note that both the objects will point towards same object as the default ==> "Singleton"
        Laptop l1 = (Laptop) context.getBean("laptop");
        Laptop l2 = (Laptop) context.getBean("laptop");


        // Now depending upon the type of scope the spring container will create single/multiple objects

        l1.setBrand("Asus");
        l2.setBrand("Apple");



        System.out.println(l1.getBrand());
        System.out.println(l2.getBrand());


        /*
        It's important to realise that if we define two beans in the xml cfg file for laptop then
        we can create two different objects at most using those two beans in the container whose
        default scope is Singleton

         */

    }
}
