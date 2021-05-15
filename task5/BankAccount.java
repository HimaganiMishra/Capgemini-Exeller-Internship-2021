package task5;

public class BankAccount {

	private String accountHolderName;
	private int balance;
	private boolean status; // true for active // false for inactive
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		if(status == true) {
			System.out.println("ACTIVE");
		}
		if(status == false) {
			System.out.println("INACTIVE");
		}
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// business methods
	public int doWithdrawal(int amount)
	{
		
		if(balance<10000) {
			status = false;
		}
		else {
			status = true;
			balance = balance - amount;
		}
		return balance;
	}
	
	public int doDeposit(int amount)
	{
		balance = balance+amount;
		
		return balance;
	}

	
}