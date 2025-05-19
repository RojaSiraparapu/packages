package com.bank.accounts;

public class BankAccount
{
	private String accountNumber;
	private double balance;
	
	public void setaccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getaccountNumber()
	{
		return accountNumber;
	}
	public double getbalance()
	{
		return balance;
	}
	
	public void showAccountDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
	}
}