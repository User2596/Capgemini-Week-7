package oops.encapsulation.users;

import oops.encapsulation.accounts.AbcAcc;

public class Abc extends AbcAcc {

	public static void main(String[] args) {
		short pin = 6598;
		AbcAcc abcAcc = new AbcAcc();
		System.out.println(abcAcc.getBal(pin));
		System.out.println(getBal());
	}

}
