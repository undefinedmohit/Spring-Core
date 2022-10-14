package com.tut.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    

	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started.." );
        
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
       //creating students.....
        
        Student st= new Student();
        st.setId(106);
        st.setCity("Saharanpur");
        st.setName("salman khan");	
        System.out.println(st);
        
        
        //creating object of address class;
        
        Address ad= new Address();
        ad.setStreet("Prakash lok apna..");
        ad.setCity("Saharanpur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.1151);
       
        //readin image........
        
        FileInputStream fis= new FileInputStream("src/main/java/pic.jpg");
        byte[] data= new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        fis.close();
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        
        
        tx.commit();
        
        session.close();
        System.out.println("done..");
    }
    
}
