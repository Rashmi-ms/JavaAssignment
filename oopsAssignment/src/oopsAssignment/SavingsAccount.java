package oopsAssignment;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(String accNumber, String accName, double rate) {
		super(accNumber, accName);
		interestRate = rate;
	}
public void addInterest() {
	double interest = getBalance() * interestRate/100;
	this.deposit(interest);
}
}
 class SavingsAccountDemo {

	public static void main(String[] args) {
		SavingsAccount saving = new SavingsAccount("20120", " Abul Raman", 10);
		saving.deposit(500);
		System.out.println("Before Interest: " + saving.getBalance());
		saving.addInterest();
		System.out.println("After Interest: " + saving.getBalance());
	}

}


