package problemStatement.banking.accounts;

import problemStatement.banking.accounts.exception.InsufficientBalanceException;
import problemStatement.banking.accounts.exception.InvalidAmountException;
import problemStatement.banking.accounts.exception.InvalidPinException;

public abstract class Account {
	private long accountNumber;
	private User user;
	private double balance;
	private int pin;	
	
	public Account(long accountNumber, User user, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.user = user;
		this.balance = balance;
		this.pin = pin;
		System.out.println("Account Details:");
		System.out.println("Name: " + this.user.getAccountHolderName());
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Pin: " + this.pin);
		System.out.println("Balance: " + this.balance);
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
//	public String getAccountHolderName() {
//		return accountHolderName;
//	}
//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void checkPin(int pin) throws InvalidPinException{
		if (this.pin!=pin) throw new InvalidPinException();
	}
	public double getBalance(int pin) throws InvalidPinException {
		if (this.pin!=pin) throw new InvalidPinException();
		return balance;
	}
	public void setBalance(int pin, double balance) throws InvalidPinException {
		if (this.pin!=pin) throw new InvalidPinException();
		this.balance = balance;
	}
	
	public void withdraw(int pin, double amount) throws InvalidPinException, InvalidAmountException {
		if (amount <= 0) throw new InvalidAmountException();
		double balance = this.getBalance(pin);
		if (balance < amount) throw new InsufficientBalanceException();
		this.setBalance(pin, balance-amount);
	}
	
	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) throw new InvalidAmountException();
		balance+=amount;
	}
	
//	public boolean transact()
	public abstract void getType();
	
}
