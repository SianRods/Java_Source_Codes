package com.rods;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Student {

    @Id
    public int rollno;
    public String name;
    public int std;

    // Telling the hibernate that don't create an additional table the student laptop table arealdy
    // matches it's owner students
    @OneToMany(mappedBy = "student")
    // Implementing a scenario where a single student can have multiple laptops
    public List<Laptop> laptops;

    /*
    Implementing a Many-Many Version of the same thing

    Incase of Many-to-Many it becomes really important for us to mention that either one is mapped
    cause both the many-to-many entites can have ana EGO issue where they both create a third table
    laptop_student
    student_laptop
    @ManyToMany(mappedBy="laptops")
    public <Laptops> laptops;

     */


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", std=" + std +
                ", laptops=" + laptops +
                '}';
    }
}
