package oops.encapsulation.accounts;

public class AbcAcc {
	private static double bal = 6000;
	private short pin = 6598;
	
	public double getBal(short pin) {
		return this.pin==pin ? bal:-1;
	}
	protected static double getBal() {
		return bal;
	}
	public void setBalCredit(double amt) {
		bal+=amt;
	}
	public void setBalDebit(double amt) {
		bal-=amt;
	}
}
