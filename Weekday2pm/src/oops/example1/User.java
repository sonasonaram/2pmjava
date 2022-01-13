package oops.example1;

public class User {

	private Credentials credentials;
	private PersonalDetails personalDetails;
	private BankDetails bankDetails;
	
	public User(Credentials credentials) {
		this.credentials = credentials;
	}
	
	public void addPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
	public void addBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	public Credentials getCredentials() {
		return credentials;
	}
	
}
