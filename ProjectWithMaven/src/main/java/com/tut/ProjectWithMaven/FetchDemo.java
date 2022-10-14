package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student sst=(Student)session.get(Student.class, 106);
		
		System.out.println(sst);
		
		Address add=(Address)session.load(Address.class, 6);
		System.out.println(add);
		
		
		
		session.close();
		factory.close();
		
		
	}
	
}
