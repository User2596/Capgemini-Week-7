package problemStatement.banking.accounts.exception;

public class InvalidPinException extends Exception {

	public InvalidPinException() {
		super("The PIN you entered does not match with the User PIN. Please try again");
	}
}
