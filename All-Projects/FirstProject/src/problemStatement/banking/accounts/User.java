package problemStatement.banking.accounts;

public class User {
	private CurrentAccount currentAccount;
	private SavingsAccount savingsAccount;
	private String accountHolderName;
	
	public User(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public CurrentAccount fetchCurrentAccount() {
		if (currentAccount == null) {
			currentAccount =
				new CurrentAccount((long)(Math.random()*Long.MAX_VALUE), this, 0, (int)(Math.random()*9999));
		}
		return currentAccount;
	}
	
	public SavingsAccount fetchSavingsAccount() {
		if (savingsAccount == null) {
			savingsAccount =
				new SavingsAccount((long)(Math.random()*Long.MAX_VALUE), this, 0, (int)(Math.random()*9999));
		}
		return savingsAccount;
	}
}
