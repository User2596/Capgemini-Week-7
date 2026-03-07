package problemStatement.banking.accounts.exception;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException() {
		super("Withdrawal amount exceeds account balance");
	}
}
