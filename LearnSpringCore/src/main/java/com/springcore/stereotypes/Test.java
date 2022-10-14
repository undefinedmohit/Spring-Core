package com.springcore.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypes/streoconfig.xml");

		Employee e = con.getBean("employee", Employee.class);
		
		System.out.println(e.getCity());
		System.out.println(e.getPii());
		System.out.println(e.isActive());
	}

}
