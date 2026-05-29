package classwork_20;

public class Car extends Vehicle{
	
	String model;
	Car(String brand, String model) {
		super(brand);
		this.model = model;
	}
	
	
	@Override
	void honk() {
		System.out.println("Brand: " + brand + " model: " + model);
	}
}
