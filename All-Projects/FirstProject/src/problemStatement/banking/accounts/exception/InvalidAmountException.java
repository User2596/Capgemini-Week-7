package problemStatement.banking.accounts.exception;

public class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super("Amount must be positive");
	}
}
