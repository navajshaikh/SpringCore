package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	//employee class demo
	 public static void main( String[] args )
	    {
	        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	        Employee obj= (Employee) ac.getBean("e1");
	       System.out.println(obj);
	        ac.close(); 
	    }

}
