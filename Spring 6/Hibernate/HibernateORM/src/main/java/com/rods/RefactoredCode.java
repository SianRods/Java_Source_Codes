package com.rods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class RefactoredCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Session Factory
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.rods.Account.class)
                .configure().buildSessionFactory();

        //creating a session using the session factory
        Session session = sf.openSession();

        Account a3 = new Account();
        System.out.println("Enter the ID of the Account : ");
        a3.setAccntNumber(sc.nextInt());
        System.out.println("Enter the Location of the Account : ");
        a3.setLocation(sc.next());
        System.out.println("Enter the Name of the Account : ");
        a3.setName(sc.next());

        Transaction transaction = session.beginTransaction();
        session.persist(a3);
        transaction.commit();

        sf.close();
    }


}
