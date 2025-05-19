package com.vehicles;

public class Car
{
	private String brand;
	private String model;
	private double price;
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}

	public double getprice()
	{
		return price;
	}
	
	public void showCarDetails()
	{
		System.out.println("Car brand: "+brand);
		System.out.println("Car Model: "+model);
		System.out.println("Car Price: "+price);
	}

}