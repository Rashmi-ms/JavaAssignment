package collectionframework;

public class BankAccountList {
	public static void main(String[] args) {
    SavingsAccount abc = new SavingsAccount("abc",11);
    SavingsAccount xyz = new SavingsAccount("xyz",12);
    SavingsAccount mno = new SavingsAccount("mno",13);
    SavingsAccount pqr = new SavingsAccount("pqr",14);
    

}
	
}
 class SavingsAccount{
     String accountHolderName;
     int acc_id;
	 int acc_balance;
	 boolean isSalaryAccount = false;
	 int deposit;
	 int withdraw;
	 public SavingsAccount(String accountHolderName, int acc_id) {
			super();
			this.accountHolderName = accountHolderName;
			this.acc_id = acc_id;
		}
	 
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
    public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}	  
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
 
	
	

 }
 
 
