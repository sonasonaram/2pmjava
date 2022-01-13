package oops.example1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Admin vishal = new Admin();
		
		System.out.println("Choose any of the following");
		System.out.println("1 -> CREATE USER");
		System.out.println("2 -> ADD BANK DETAILS TO USER");
		System.out.println("3 -> ADD PERSONAL DETAILS TO USER");
		System.out.println("4 -> SEE ALL USERS");
		System.out.println("0 -> EXIT");
		
		while (true) {
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if (choice == 0) {
				System.out.println("EXITING...");
				break;
			}
			
			else if (choice == 1) {
				System.out.print("Enter Username: ");
				String username = scanner.nextLine();
				System.out.print("Enter Password: ");
				String password = scanner.nextLine();
				vishal.createNewUser(username, password);
			}
			
			else if (choice == 4) {
				vishal.printAllUsers();
			}
		}
	}

}
