package com.rods;

public class Programmer {
    private int age;
    private String name;

    // Here instead of having a laptop we will use Computer as an interface which can be sorted using the cfg file
    //private Laptop laptop;

    private Computer computer;

    public Programmer() {
        System.out.println("Programmer Object Created !!");
        System.out.println("This is a programmer ....");
    }
        /*
        Note that whenever we are using the paramaterized constructor we are actually trying to acheive
        sequential injection in order in xml file when are are not using the index value
        *Only mentioning the type works if the parameters are all of distinct types only
        */

    public Programmer(int age, Computer computer, String name) {
        System.out.println("Paramaterized Constructor Programmer..");
        this.age = age;
        this.computer = computer;
        this.name = name;
    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void codes() {
        System.out.println("Programmer codes....");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", Computer=" + computer +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
