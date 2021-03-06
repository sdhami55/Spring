package org.spring.sampleproject;

import java.util.Scanner;

import org.spring.sampleproject.config.BeanConfiguration;
import org.spring.sampleproject.entity.Address;
import org.spring.sampleproject.service.AccountService;
import org.spring.sampleproject.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		AccountServiceImpl accountService = (AccountServiceImpl)context.getBean("accountServiceImpl");
		
		System.out.println("AccountBalance : " + accountService.balanceEnquiry() );
		
		System.out.println("Emoployee Details : - ");
		accountService.displayDetails();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter new Balance");
		
		double newBalance= scan.nextDouble();
		
		System.out.println("Please Enter new Address");
		System.out.println("Please Enter new Hno");
		
		String hno = scan.next();
		
		System.out.println("Please Enter new Street");
		
		String street = scan.next();
		
        System.out.println("Please Enter new Area");
		
		String area = scan.next();
		
        System.out.println("Please Enter new City");
		
		String city = scan.next();
		
        System.out.println("Please Enter new ZipCode");
		
		String zipCode = scan.next();
		
		Address addr=new Address(hno,street,area,city,zipCode);
		
		accountService.getAccount().setBalance(newBalance);
		accountService.getAccount().setAcctHolderAddress(addr);
		
		System.out.println();
		System.out.println();
		System.out.println("Account details with  new balance and address");
		
		accountService.displayDetails();	
		
		
	}

}
