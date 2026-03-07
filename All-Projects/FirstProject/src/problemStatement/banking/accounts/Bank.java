package problemStatement.banking.accounts;

import java.util.ArrayList;

public class Bank {
	private static Bank bank = new Bank();
	private static String bankName = "ABC Bank";
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	private ArrayList<User> userList;
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	private Bank() {}
	
	public static Bank getBank() {
		return bank;
	}
}
