public class CheckingAccount extends BankAccount {
	
	private final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		
		this.setAccountNumber(this.getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amount) {
		if (amount > this.getBalance())
			return false;
		else if((amount + this.FEE) > this.getBalance())
			return false;
		
		return super.withdraw(amount + this.FEE);
	}
}
