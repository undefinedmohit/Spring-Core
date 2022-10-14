package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OperationOfHql {

	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		 Session s = factory.openSession();
		
		 String query= "from Students where city=:x";
		 
		Query<Students> q =s.createQuery(query);
		
		
		/* q.uniqueResult() --- for single instance*/ 
		/* q. util.(list) --- for multiple instances*/ 
		
		 
		q.setParameter("x","dehradun");
		 List<Students> list= q.list();
		 for(Students ss:list)
		 {
			 System.out.println(ss.getName());
		 }
		
	
	}
}
