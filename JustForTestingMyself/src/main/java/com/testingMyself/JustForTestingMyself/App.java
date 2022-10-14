package com.testingMyself.JustForTestingMyself;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Connected...." );
        Configuration cfg= new Configuration().configure();
        
        SessionFactory factory =cfg.buildSessionFactory();
        
       Entities en =new Entities("Mohit Yadav", 24, "city", 67.11);
       
      Session session =factory.openSession();
      Transaction tx= session.beginTransaction();
      
      session.save(en);
      
      tx.commit();
      session.close();
      factory.close();
        
    }
}
