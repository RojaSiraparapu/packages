package com.electronics.brands;
public class Manufacturer {
private String brandName;
private String country;
// Setter methods
public void setBrandName(String brandName) {
this.brandName = brandName;
}
public void setCountry(String country) {
this.country = country;
}
// Getter methods
public String getBrandName() {
return brandName;
}
public String getCountry() {
return country;
}
// Method to display manufacturer details
public void showManufacturerDetails() {
System.out.println("Brand Name: " + brandName);
System.out.println("Country of Origin: " + country);
}
}