package com.remove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("started......");
		ApplicationContext con=new AnnotationConfigApplicationContext("Config.java");
		
		Charger c=con.getBean("getCharger",Charger.class);
		System.out.println(c);
		
	}

}
