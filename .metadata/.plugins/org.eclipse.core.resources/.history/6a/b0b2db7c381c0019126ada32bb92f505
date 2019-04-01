package org.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Customer c=(Customer)context.getBean(Customer.class);
		
		System.out.println(c);
	}

}
