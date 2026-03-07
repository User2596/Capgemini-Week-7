package problemStatement.investmentFirm;

import problemStatement.investmentFirm.exception.InvalidInvestmentException;
import problemStatement.investmentFirm.exception.InvestmentRejectedException;

public class DebtInvestment extends InvestmentTransaction {

	public DebtInvestment(String id, String name, double amount) {
		super(id, name, amount, InvestmentType.DEBT);
	}

	@Override
	public InvestmentTransaction applyTax(double percent) {
		try {
			validatePercent(percent);
		} catch (InvalidInvestmentException e) {
			System.out.println(e.getMessage());
			return this;
		}
		double newAmount = getInvestedAmount()*(1-percent/100);
		return new DebtInvestment(getTransactionId() + "-TAX", getInvestorName(), newAmount);
	}

	@Override
	public InvestmentTransaction applyBonus(double percent) {
		try {
			validatePercent(percent);
		} catch (InvalidInvestmentException e) {
			System.out.println(e.getMessage());
			return this;
		}
		double newAmount = getInvestedAmount()*(1-percent/100);
		return new DebtInvestment(getTransactionId() + "-TAX", getInvestorName(), newAmount);
	}
	
	@Override
	public void authorize() {
		if (getInvestedAmount() < 200) throw new InvestmentRejectedException(getInvestmentType(), 200);
		System.out.println(getTransactionId() + " authorized");
	}

	@Override
	public void authorize(String securityCode) {
		if (securityCode != "tdtydycvwyt") throw new InvestmentRejectedException();
		authorize();
		System.out.println(getTransactionId() + " authorized with security code");
	}
}
