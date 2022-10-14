package com.map;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		
		Question q= new Question();
		q.setId(11);
		q.setQuestion("What is Java?");
		
		Answer ans=new Answer();
		ans.setId(122);
		ans.setAnswer("Java is platform independent programming language...");
		
		ans.setqId(q);
		
		q.setAnswer(ans);
		
		Session session = factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(q);
		session.save(ans);
		
		tx.commit();
		session.close();
		factory.close();
		
	}

}
