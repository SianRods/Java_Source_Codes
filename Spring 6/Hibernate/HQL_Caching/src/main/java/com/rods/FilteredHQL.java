package com.rods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class FilteredHQL {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        //retreiving the l1 object inserted in main with placeholders

        // Now we will try to retreive the results using HQL
        Query query = session.createQuery("Select name from Laptop where ram=?1");
        query.setParameter(1, 64);
        List<Object[]> result = query.getResultList();

        // Printing the object list
        for (Object o : result) {
            System.out.println("Printed : " + o);
        }


        transaction.commit();
        sf.close();
    }


}
