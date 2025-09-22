package com.rods;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {

    @Id
    public int lid;
    public String name;
    public int ram;

    // a single laptop can be owned by only a single student
    @ManyToOne
    public Student student;


    /*
    Implementing a Many-Many Version of the same thing

    Incase of Many-to-Many it becomes really important for us to mention that either one is mapped
    cause both the many-to-many entites can have ana EGO issue where they both create a third table
    laptop_student
    student_laptop
    @ManyToMany(mappedBy="laptops")
    public <Students> students;

     */

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", student=" + student +
                '}';
    }
}
