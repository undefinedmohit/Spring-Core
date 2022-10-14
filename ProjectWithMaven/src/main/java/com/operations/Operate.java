package com.operations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Operate {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee emp1= new Employee();
		emp1.setId(10);
		emp1.setName("Mohit");
		emp1.setDg("Java developer");
		
		Laptop l=new Laptop();
		l.setId(10);
		l.setName("Dell");
		l.setEmp(emp1);
		
		Laptop l2=new Laptop();
		l2.setId(12);
		l2.setName("Asus");
		l2.setEmp(emp1);
		
		Laptop l3=new Laptop();
		l3.setId(13);
		l3.setName("HP");
		l3.setEmp(emp1);
		
		List<Laptop> list= new ArrayList<Laptop>();
		list.add(l);
		list.add(l2);
		list.add(l3);
		
		emp1.setLaptop(list);
	
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		session.save(emp1);
		session.save(l);
		session.save(l2);
		session.save(l3);
		
		
		
		tx.commit();
		
		
		Employee e=(Employee)session.get(Employee.class, 10);
		System.out.println(e.getName()+" : "+e.getDg()+" : "+e.getId());
		
		for(Laptop ll:e.getLaptop())
		{
			System.out.println(ll.getName());
		}
		
		
		session.close();
		factory.close();
	}

}
