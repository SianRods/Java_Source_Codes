package com.rods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Programmer {


    @Value("31")
    public int age;
    @Autowired()
    @Qualifier("laptop")
    private Computer computer;


    public Programmer() {
        System.out.println("Programmer Object Created...");
    }

//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}

    public int getAge() {
        System.out.println("Age setter has been called by the value annotation(stereotype annotation)");
        return age;
    }

    public void setAge(int age) {    // Setter Injection
        //System.out.println("Setter called");
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