package com.rods;


public class Programmer {

    private int age;
    private Computer computer;

    public Programmer() {
        System.out.println("Programmer Object Created");
    }

//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}

    public int getAge() {
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