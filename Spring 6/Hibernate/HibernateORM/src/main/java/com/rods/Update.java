package com.rods;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class Update {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().addAnnotatedClass(com.rods.Account.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();

        // Creating a new account object with the similar id and then updating the same in the database
        // we can also fetch the object from the database and then update the same in the database
        Transaction transaction = session.beginTransaction();
        // Extracting the account object with the EmployeeID as 4
        Account a  = session.byId(Account.class).load(4);
        System.out.println(a);

        a.setName("Pensar");
        a.setName("United States");

        session.persist(a);
        transaction.commit();
        sf.close();

    }


}
