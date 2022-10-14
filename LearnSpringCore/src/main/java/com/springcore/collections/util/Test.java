package com.springcore.collections.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/collections/util/utilconfig.xml");
	
	A s=context.getBean("coll", A.class);
	
	System.out.println(s+"\n"+s.getList().getClass().getName());
	
	
		
	}
}
