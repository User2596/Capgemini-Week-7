package problemStatement.banking.accounts;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	static Bank bank = Bank.getBank();
	static boolean exit = false;
	public static void main(String[] args) {
		USER:
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to " + bank.getBankName());
			System.out.print("Enter your name: ");
			String userName = sc.nextLine();
			ArrayList<User> userList = bank.getUserList();
			if (userList!= null) for (User u : userList)
				System.out.println(u.getAccountHolderName());
			boolean userExists = false;
			User user = null;
			if (userList!= null) {
				for (User u : userList) {
					if (u.getAccountHolderName().equals(userName)) {
						userExists = true;
						user = u;
					}
				}
			} else {
				user = new User(userName);
				userList = new ArrayList<>();
				userList.add(user);
			}
			System.out.println("Welcome" + (userExists ? " back" : "") + ", "+ userName);
			Account account = null;
			do {
				System.out.println("Select account type:");
				System.out.println("1. Current");
				System.out.println("2. Savings");
				System.out.println("3. Exit");
				System.out.print("Enter your choice: ");
				int choice = 0;
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Caught Exception: " + e.getMessage());
					continue;
				}
				
				switch(choice) {
				case 1:
					account = user.fetchCurrentAccount();
					break;
				case 2:
					account = user.fetchSavingsAccount();
					break;
				case 3:
					continue USER;
				default:
					System.out.println("Try again");
				}
			} while (account == null);
			System.out.print("This account is a ");
			account.getType();
			System.out.println("Account Number: " + account.getAccountNumber());
			do {
				System.out.println("Select operation:");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Exit");
				System.out.print("Enter your choice: ");
				int choice = 0;
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Caught Exception: " + e.getMessage());
					sc.nextLine();
					continue USER;
				}
				int pin = 0;
				double amount = 0;
				if ((choice-1)/2==0) {
					System.out.print("Enter your pin: ");
					pin = sc.nextInt();
					System.out.print("Enter amount: ");
					amount = sc.nextDouble();
				}
				switch(choice) {
				case 1:
					try {
						account.withdraw(pin, amount);
					} catch (Exception e) {
						System.out.println("Caught Exception: " + e.getMessage());
					}
					break;
				case 2:
					try {
						account.checkPin(pin);
						account.deposit(amount);
						System.out.println("Current balance: " + account.getBalance(pin));
						
					} catch (Exception e) {
						System.out.println("Caught Exception: " + e.getMessage());
					}
					break;
				case 3:
					exit = true;
					continue USER;
				default:
					System.out.println("Try again");
				}
			} while (true);
		} while (!exit);
	}
}