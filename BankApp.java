package com.bank.app;
import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp
{
	public static void main(String args[])
	{
		BankAccount bank=new BankAccount();
		bank.setaccountNumber("SBI55675");
		bank.setbalance(50000.0);
		
		Customer customer=new Customer();
		customer.setcustomerName("S.Roja");
		customer.setcustomerId(1);
		
		bank.showAccountDetails();
		System.out.println();
		customer.showCustomerDetails();
	}
}