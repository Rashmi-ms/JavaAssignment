package oopsAssignment;

public class BankAccountDemo {

	public static void main(String[] args) {
			BankAccount abraman = new BankAccount("20120", " Abul Raman");
			abraman.deposit(500);
			abraman.deposit(1500);
			System.out.println("Balance is: " + abraman.getBalance());
			abraman.withdraw(400);
			System.out.println("Balance is: " + abraman.getBalance());

}
}
