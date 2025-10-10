package com.rods;

/*
In this particular section we will focus of the relation mapping between two tables in the databases
and how the same is managed by using the annotation available in the hibernate
 */

/*
Embeddable is Okay iff there exists one-to-one relation but when we talk about
one-many,many-one , many-many ==> we do need a relational annotation and mostly a separate table
 */

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.rods.Laptop.class)
                .addAnnotatedClass(com.rods.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transact = session.beginTransaction();

        Student s1 = new Student();
        s1.setName("Gadge");
        s1.setRollno(1);
        s1.setStd(14);

        Student s2 = new Student();
        s2.setName("Sarang");
        s2.setRollno(2);
        s2.setStd(16);

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setName("Asus");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setName("Macbook");
        l2.setRam(8);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setName("Dell XPS");
        l3.setRam(32);

        s1.setLaptops(Arrays.asList(l1,l2));
        s2.setLaptops(Arrays.asList(l3));
        l1.setStudent(s1);
        l2.setStudent(s1);
        l3.setStudent(s2);

        session.persist(s1);
        session.persist(l1);
        session.persist(l2);
        session.persist(s2);
        session.persist(l3);

        transact.commit();
        System.out.println("Transaction Committed Succesfully ✅✅");
        session.close();

        System.out.println(s1);


    }
}