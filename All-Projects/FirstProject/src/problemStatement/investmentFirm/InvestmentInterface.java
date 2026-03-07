package problemStatement.investmentFirm;

import java.util.Scanner;

public class InvestmentInterface {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter name: ");
		String name = sc.next();
		User user = User.fetchUser(name);
		InvestmentTransaction inv1 = new EquityInvestment("VTGTT", user.getUserName(), 263.32);
		inv1 = inv1.applyTax(35);
		inv1.authorize();
	}
}