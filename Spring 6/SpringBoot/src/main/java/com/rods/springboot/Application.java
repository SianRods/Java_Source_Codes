package com.rods.springboot;

import com.rods.springboot.model.*;
import com.rods.springboot.service.*;
import com.rods.springboot.model.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("Hello Spring !");

        // Programmer p1 = context.getBean(Programmer.class);
        // p1.code();

        LaptopService service = context.getBean(LaptopService.class);
        Laptop l1 = context.getBean(Laptop.class);

        // Telling the LaptopSerivce to take the laptop and please store it in db
        service.addLaptop(l1);


    }

}
