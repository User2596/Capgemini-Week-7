package com.jdbc;

import java.util.Scanner;

public class ExpClass {
	private static class UnsuccessfulAttemptException extends Exception {
		public UnsuccessfulAttemptException() {
			super("Max 5 Unsuccessful Attempts Allowed");
		}
	}
	
	private static class User {
		private int attempt = 0;
		private String pass = "Password";
		
		public boolean matchPassword(String s) throws UnsuccessfulAttemptException {
			checkAttempt(attempt);
			if (pass.equals(s)) return true;
			else checkAttempt(++attempt);
			return false;
		}
		
		private void checkAttempt(int attempt) throws UnsuccessfulAttemptException {
			if (attempt>=5) throw new UnsuccessfulAttemptException();
		}
	}
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag = false;
		User u = new User();
		try {
			do {
				System.out.print("Enter your password: ");
				String s = sc.nextLine();
				if (u.matchPassword(s)) flag = true;
			} while(!flag);
			System.out.println("Login successful!");
		} catch (UnsuccessfulAttemptException e) {
			System.out.println("Login Unsuccessful");
			System.out.println(e.getMessage());
		}
	}
}
