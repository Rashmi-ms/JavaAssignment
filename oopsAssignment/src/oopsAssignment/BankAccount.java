package oopsAssignment;

public class BankAccount {
	private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accNumber, String accName) {
    	accountNumber = accNumber;
        accountName = accName;
        balance = 0;
    }

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}
    public boolean deposit(double amount) {
    	if(amount > 0) {
    		balance+=amount;
    		return true;
    	}else {
    		return false;
    	}
    }
    public boolean withdraw(double amount) {
    	if(amount > balance) {
    		return false;
    	}else {
    		balance-=amount;
    		return true;
    	}
    }

}
