package oops.inheritence.isA.classTypes;

public class DriverClass {

	static {
		i=1;
//		System.out.println(i);
	}
	static final int i;
	
	{
		j=1;
	}
	final int j;
	
	static int iS = 7;				// Is being treated like final by default
	static {
		System.out.println("HW");
	}
	public static void nameS() {}
	int iNS = 7;
	{
		System.out.println("HW");
	}
	public void nameNS() {}
	DriverClass() {} 				// No constructor so no non-static members

//	abstract static int iSA;
//	abstract static;
//	public abstract static void nameSA();
//	abstract int iNSA = 7;
//	abstract;
//	public abstract void nameNSA();
//	abstract DriverEmployee();
	
	public static void main(String[] args) {
//		AbstractClass abs = new AbstractClass();
		AbstractClass.nameS();
		
	}
}
