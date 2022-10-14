package com.springcore.life;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/life/config.xml");

//		A x = (A) context.getBean("a");
//		
//		System.out.println(x);
//		context.registerShutdownHook();
//	
//		System.out.println("--------------------------------------------------------------");
//		
//	Pizza p	=(Pizza)context.getBean("p1");
//	
//	System.out.println(p);
//	
//	context.close();
		
		Service s = (Service) context.getBean("s1");
		
		
		System.out.println(s);
		
		context.registerShutdownHook();
		
	}
}
