package com.operations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlOperations {

	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session s= factory.openSession();
		Transaction tx= s.beginTransaction();
		Query<Laptop> ll =s.createQuery("update Laptop set name=:x where id=:c");
		ll.setParameter("x", "Macbook");
		ll.setParameter("c", 13);
		
		int r=ll.executeUpdate();
		System.out.println(r+"object updated..");
		tx.commit();
		s.close();
		factory.close();
		
	}
}
 