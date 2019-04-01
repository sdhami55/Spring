package org.spring.sampleproject.config;

import org.spring.sampleproject.entity.Account;
import org.spring.sampleproject.entity.Address;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.sampleproject")
public class BeanConfiguration {
	
	
	@Bean
	public Address getAddress()
	{
		Address address = new Address();
		
		address.sethNo("HNO-203");
		address.setStreet("DangeChowkRoad");
		address.setArea("Hinjewadi");
		address.setCity("Pune");
		address.setZipCode("411057");
		
		return address;
		
	}
	
	@Bean
	public Account getAccount()
	{
		Account account = new Account();
		account.setAccountID("3250984604");
		account.setAccountHolderName("karan");
		account.setBalance(650000);
		account.setAcctHolderAddress(getAddress());
		return account;
	}

}
