package p1;

public class C1 {
	public static void publicMethod() {
		System.out.println("From publicMethod");
	}
	@SuppressWarnings("unused")
	private static void privateMethod() {
		System.out.println("From privateMethod");
	}
	protected static void protectedMethod() {
		System.out.println("From protectedMethod");
	}
	static void defaultMethod() {
		System.out.println("From defaultMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		varArgs(1,2,3);
		System.out.println("end");
	}
	
	public static void varArgs(double ... d) {
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
}
