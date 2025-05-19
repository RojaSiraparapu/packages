package com.bank.customers;

public class Customer
{
	private String customerName;
	private int customerId;
	
	public void setcustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public void setcustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	public int getcustomerId()
	{
		return customerId;
	}
	
	public void showCustomerDetails()
	{
		System.out.println("Customer Name: "+customerName);
		System.out.println("customer Id: "+customerId);
	}
}