package oops.basics;

public class Teacher {

	private String name;
	private String[] subjects;
	
	public Teacher(String name, String ... subjects) {
		this.name = name;
		this.subjects = subjects;
	}
	
	public void teach(int index) {
		System.out.println(name + " is teaching " + subjects[index]);
	}
}
