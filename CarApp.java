package com.vehicles.app;
import com.vehicles.Car;
import com.vehicles.parts.Engine;

public class CarApp
{
	public static void main(String args[])
	{
		Car car=new Car();
		car.setBrand("Honda");
		car.setModel("Prius");
		car.setprice(5300000.0);
		
		Engine engine=new Engine();
		engine.setEngineType("V-type Engine");
		engine.sethorsepower(3800);

		car.showCarDetails();
		System.out.println();
		engine.showEngineDetails();	
	}
}