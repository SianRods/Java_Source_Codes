package com.rods.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Programmer {


    @Value("31")
    public int age;

    // Instead of setting the autowire here we will perform the setter injection
    //  using the setter() method for the Computer
    @Autowired
    private Computer computer;


    public Programmer() {
        System.out.println("Programmer Object Created...");
    }


    public int getAge() {
        System.out.println("Age setter has been called by the value annotation(stereotype annotation)");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Computer getComputer() {
        return computer;
    }

    public void setCom(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        System.out.println("Coding");
        computer.compile();
    }

}