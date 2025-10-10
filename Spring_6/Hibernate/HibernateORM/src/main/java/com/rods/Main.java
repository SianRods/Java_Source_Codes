package com.rods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Pancard pancard=new Pancard();
        pancard.setNumber(2484392);
        pancard.setBirthday("26-10-2004");
        pancard.setPOB("Virar");

        Account a1 = new Account();
        a1.setAccntNumber(2);
        a1.setLocation("Navi Numbai");
        a1.setName("John");
        a1.setPancard(pancard);


        Configuration cfg = new Configuration();

        cfg.configure();
        // Adding the annotated data to the configuration path
        cfg.addAnnotatedClass(com.rods.Account.class);
        // Creating an instance of the SessionFactory using the buildsessionfactory
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();


        //For every update query/insertion into the database
        // in hibernate we have to deal with them in terms of Transaction
        // Transactions module is however not needed for executing the queries

        Transaction transaction = session.beginTransaction();

        session.persist(a1);
        transaction.commit();

        System.out.println(a1);

        sf.close();
    }
}
