package problemStatement.investmentFirm.exception;

public class InvalidInvestmentException extends Exception {

	public InvalidInvestmentException(String message) {
		super("Invalid Investment: " + message);
	}
	
}
