package problemStatement.banking.accounts;

public class SavingsAccount extends Account {

	public SavingsAccount(long accountNumber, User user, double balance, int pin) {
		super(accountNumber, user, balance, pin);
	}

	@Override
	public void getType() {
		System.out.println("Savings Account");
	}

}
