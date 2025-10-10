package com.rods;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HQL {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Laptop l1 = new Laptop();
        l1.setName("Asus");
        l1.setRam(64);

        Transaction transaction = session.beginTransaction();
//        session.persist(l1);

        // Now we will try to retreive the results using HQL
        Query query = session.createQuery("from Laptop where ram=64");
        List<Laptop> laptops = query.getResultList();
        System.out.println(laptops);



        transaction.commit();
        sf.close();
    }
}
