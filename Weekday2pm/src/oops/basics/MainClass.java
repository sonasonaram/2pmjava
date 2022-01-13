package oops.basics;

public class MainClass {

	public static void main(String[] args) {

		// ClassName objectName = "new" ClassName() -> Constructor
		
		Laptop l1 = new Laptop("dell", "Inspiron", 15.6);
		Laptop l2 = new Laptop("hp", "Spectre", 14);
		
		Student s1 = new Student("Ramesh", 3, 10, 'B', l1);
		Student s2 = new Student("Vignesh", 52, 7, 'A', l2);
		Teacher t1 = new Teacher("Nisha", "Physics", "Maths", "Chemistry", "Philosophy");
		Teacher t2 = new Teacher("Jayanth", "History", "Geography", "Computer");

		
		t1.teach(3);
		s2.study();
		t1.teach(2);
	}

}
