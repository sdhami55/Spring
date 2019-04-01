package org.spring.sampleproject.entity;



public class Account {
	private String	accountID;
	private String	 accountHolderName;
	private double balance;
	private Address	acctHolderAddress;
	
	public Account() {
		super();
		
	}

	public Account(String accountID, String accountHolderName, double balance, Address acctHolderAddress) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.acctHolderAddress = acctHolderAddress;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Address getAcctHolderAddress() {
		return acctHolderAddress;
	}

	public void setAcctHolderAddress(Address acctHolderAddress) {
		this.acctHolderAddress = acctHolderAddress;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ ", acctHolderAddress=" + acctHolderAddress + "]";
	}
	
	
	
	


}
