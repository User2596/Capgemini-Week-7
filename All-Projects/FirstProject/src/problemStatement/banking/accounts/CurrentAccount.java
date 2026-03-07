package problemStatement.banking.accounts;

public class CurrentAccount extends Account {

	public CurrentAccount(long accountNumber, User user, double balance, int pin) {
		super(accountNumber, user, balance, pin);
	}

	@Override
	public void getType() {
		System.out.println("Current Account");
	}

}
