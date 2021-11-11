public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber = "";
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		
		this.accountNumber = super.getAccountNumber();
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber();
	}
	
	public void postInterest() {
		this.setBalance((this.getBalance() * (rate/12)) + this.getBalance());
	}
	
	public String getAccountNumber() {
		return this.accountNumber + "-" + savingsNumber;
	}
}
