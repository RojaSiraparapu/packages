import com.electronics.devices.Laptop;
import com.electronics.brands.Manufacturer;
public class ElectronicsApp {
public static void main(String[] args) {
// Create Laptop object
Laptop laptop = new Laptop();
laptop.setModel("Dell XPS 15");
laptop.setPrice(1500.99);
// Create Manufacturer object
Manufacturer manufacturer = new Manufacturer();
manufacturer.setBrandName("Dell");
manufacturer.setCountry("USA");
// Display details
laptop.showLaptopDetails();
System.out.println();
manufacturer.showManufacturerDetails();
}
}