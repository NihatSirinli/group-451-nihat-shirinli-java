package classwork_10;

public class Laptop {
    String brand;
    int ram;
    double price;
    
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: $" + price);
        System.out.println("------------------");
    }
}
