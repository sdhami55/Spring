package org.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer c1=(Customer)context.getBean("customer1");
		Customer c2=(Customer)context.getBean("customer2");
		Customer c3=(Customer)context.getBean("customer3");
		
		System.out.println("Cutomer with adddress and address autowired with constructor");
		System.out.println(c1);
		
		System.out.println("Cutomer with adddress and address autowired byName");
		System.out.println(c2);
		
		System.out.println("Cutomer with adddress and address autowired byType");
		System.out.println(c3);
		
	}

}
