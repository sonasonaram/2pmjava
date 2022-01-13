package oops.basics;

public class Student {

	private String name;
	private int roll;
	private int std;
	private char section;
	private Laptop lappy;
	
	// Constructor
	// 1. it does NOT have any return type
	// 2. cannot be called the way we call a normal method
	// 3. may or may not have parameters
	// 4. gets called AUTOMATICALLY during Object Creation
	
	public Student(String name, int roll, int std, char section, Laptop lappy) {
		this.name = name;
		this.roll = roll;
		this.std = std;
		this.section = section;
		this.lappy = lappy;
	}
	
	public void study() {
		System.out.println(name + " is studying on " + lappy.getBrand() + " " + lappy.getModel() + " laptop");
	}
}
