package problemStatement.investmentFirm.exception;

import problemStatement.investmentFirm.InvestmentType;

public class InvestmentRejectedException extends RuntimeException {
	public InvestmentRejectedException(InvestmentType type, double min) {
		super("Investment could not be authorized, " + type + " transaction amount less than " + min);
	}
	public InvestmentRejectedException() {
		super("Investment could not be authorized, invalid security code");
	}
}
