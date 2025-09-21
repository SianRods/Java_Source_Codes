package com.rods;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SessionFactory sf = new Configuration().addAnnotatedClass(com.rods.Account.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction transact= session.beginTransaction();

        System.out.println("Enter the ID of the object you want to delete");

        session.remove(session.byId(Account.class).load(sc.nextInt()));
        transact.commit();
        sf.close();

    }


}
