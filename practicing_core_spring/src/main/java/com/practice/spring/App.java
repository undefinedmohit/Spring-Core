package com.practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started...." );
        
       ClassPathXmlApplicationContext con =new ClassPathXmlApplicationContext("com/practice/spring/config.xml");
       
      Apple a =con.getBean("iPhone",Apple.class);
      
      System.out.println(a); 
      
       con.close();
    }
}
