package task5;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		BankAccount customer2 = new BankAccount();
		
		customer1.setAccountHolderName("A");
		customer2.setAccountHolderName("B");
		
		customer1.setBalance(15000);
		customer2.setBalance(8000);
				
		customer1.doWithdrawal(1000);
		customer1.doDeposit(3000);
		
			
		customer2.doWithdrawal(3000);
		customer2.doDeposit(500);
		
				
		System.out.println(customer1.getAccountHolderName());
		System.out.println(customer1.getBalance());
		System.out.println(customer1.isStatus());
		
		System.out.println("-----------------------------------------------------------");
					
		System.out.println(customer2.getAccountHolderName());
		System.out.println(customer2.getBalance());
		System.out.println(customer2.isStatus());

				
		/* business use case
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */
		
		
	}
}