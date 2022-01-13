package oops.basics;

public class Laptop {

	private String brand;
	private String model;
	private double screen;
	
	public Laptop(String brand, String model, double screen) {
		this.brand = brand;
		this.model = model;
		this.screen = screen;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getScreen() {
		return screen;
	}
}
