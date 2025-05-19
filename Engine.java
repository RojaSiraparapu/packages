package com.vehicles.parts;

public class Engine
{
	private String engineType;
	private int horsepower;
	
	public void setEngineType(String engineType)
	{
		this.engineType=engineType;
	}
	public void sethorsepower(int horsepower)
	{
		this.horsepower=horsepower;
	}
	
	public String getengineType()
	{
		return engineType;
	}

	public double gethorsepower()
	{
		return horsepower;
	}
	
	public void showEngineDetails()
	{
		System.out.println("Engine Type: "+engineType);
		System.out.println("Car Horse Power: "+horsepower);
	}

}