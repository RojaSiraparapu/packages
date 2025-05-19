package com.electronics.devices;
public class Laptop {
private String model;
private double price;
// Setter methods
public void setModel(String model) 
{
this.model = model;
}
public void setPrice(double price) {
this.price = price;
}
// Getter methods
public String getModel() {
return model;
}
public double getPrice() {
return price;
}
// Method to display laptop details
public void showLaptopDetails() {
System.out.println("Laptop Model: " + model);
System.out.println("Price: $" + price);
}
}
Step 2: Create Manufacturer