package problemStatement.investmentFirm;

import problemStatement.investmentFirm.exception.InvalidInvestmentException;

public abstract class InvestmentTransaction implements Authorizable {
	private final String transactionId;
	private final String investorName;
	private final double investedAmount;
	private final InvestmentType investmentType;
	
	public InvestmentTransaction(String transactionId, String investorName, double investedAmount, InvestmentType investmentType) {
		try {
			if (investedAmount <= 0) throw new InvalidInvestmentException("Transaction amount must be greater than 0");	
		} catch(InvalidInvestmentException e) {
			System.out.println(e.getMessage());
		}
		this.transactionId = transactionId;
		this.investorName = investorName;
		this.investedAmount = investedAmount;
		this.investmentType = investmentType;
		printTransaction();
	}

	public String getTransactionId() {
		return transactionId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public double getInvestedAmount() {
		return investedAmount;
	}
	public InvestmentType getInvestmentType() {
		return investmentType;
	}
	
	public abstract InvestmentTransaction applyTax(double percent);
	public abstract InvestmentTransaction applyBonus(double percent);
	
	public void validatePercent(double percent) throws InvalidInvestmentException {
		if (percent < 0 || percent > 30) throw new InvalidInvestmentException("Tax/Bonus percent should be between 0 and 30");	
	}
	
	
	
	@Override
	public String toString() {
		return "InvestmentTransaction [transactionId=" + transactionId + ", investorName=" + investorName
				+ ", investedAmount=" + investedAmount + ", investmentType=" + investmentType + "]";
	}

	public void printTransaction() {
		System.out.println(toString());
	}
}
