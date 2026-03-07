package oops.inheritence.isA.classTypes;

public interface Interface {
	static int iS = 7;				// Is being treated like final by default
//	static {
//		System.out.println("HW");
//	}
	public static void nameS() {}
//	int iNS; 						// Interface can deal with constant variable
	int iNS = 7; 					// Is being treated like static final by default
//	{
//		System.out.println("HW");
//	}
//	public void nameNS() {}
//	AbstractClass() {} 				// No constructor so no non-static members

//	abstract static int iSA;
//	abstract static;
//	public abstract static void nameSA();
//	abstract int iNSA = 7;
//	abstract;
	public abstract void nameNSA();
//	abstract AbstractClass();
}
