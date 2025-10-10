package com.rods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.rods.Account.class)
                .configure().buildSessionFactory();

        Session session = sf.openSession();

        Account sample =session.byId(Account.class).load(4);
        System.out.println(sample);
        sf.close();


    }
}
