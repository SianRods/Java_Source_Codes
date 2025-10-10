package com.rods.springdatajpa;

import com.rods.springdatajpa.model.Internship;
import com.rods.springdatajpa.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {


    public static void main(String[] args) {


        // Ignoring the service layer for now we will directly start implementing the requests here
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        InternshipRepository repository = context.getBean(InternshipRepository.class);

        // Using the application context ==> to manage the bean lifecycle management
        Internship i1 = new Internship();
        Internship i2 = new Internship();


        i1.setId(1);
        i1.setPosition("SDE Intern");
        i1.setCompany("Meta");
        i1.setInfo("Backend Developer and SDLC");
        i1.setStipend(18000);

        i2.setId(2);
        i2.setPosition("FullStack Developer");
        i2.setCompany("Google");
        i2.setInfo("Software Engineering");
        i2.setStipend(21000);

        repository.save(i1);
        System.out.println("I1 instance saved to database successfully !");
        repository.save(i2);
        System.out.println("I2 instance saved to database successfully !");


        // fetching all the records form the database
        System.out.println(repository.findAll());

    }

}
