package oops.example1;

public class Admin {

	private User[] allUsers;
	private int userIndex;
	private int limit = 3;
	
	public Admin() {
		allUsers = new User[limit];
		userIndex = -1;
	}
	
	public void createNewUser(String username, String password) {
		Credentials credentials = new Credentials(username, password);
		User user = new User(credentials);
		userIndex++;
		if (userIndex < limit)
			allUsers[userIndex] = user;
		else
			System.out.println(limit + " Users Limit Reached");
	}
	
	public void addBankDetailsToUser(int index, BankDetails bankDetails) {
		
		if (index >= 0 && index <= userIndex)
			allUsers[index].addBankDetails(bankDetails);
		else
			System.out.println("Invalid index");
	}
	
	public void addPersonalDetailsToUser(int index, PersonalDetails personalDetails) {
		if (index >= 0 && index <= userIndex)
			allUsers[index].addPersonalDetails(personalDetails);
		else
			System.out.println("Invalid index");
	}
	
	public void printAllUsers() {
		for (int i = 0; i < userIndex; i++) {
			System.out.println(allUsers[i].getCredentials().getUsername());
		}
	}
}
