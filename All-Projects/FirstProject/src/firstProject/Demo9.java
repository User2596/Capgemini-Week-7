package firstProject;

public class Demo9 {

	static {
		System.out.println("Printed by static block");
	}
	
	static int i = staticMethod();
	static int x = 1;
	
	Demo9() {
		System.out.println("Printed by constructor");
	}
	
	int j = nonStaticMethod();
	
	{
		System.out.println("Printed by non-static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Start of main");
		new Demo9();
		System.out.println("End of main");
	}
	
	public static int staticMethod() {
		System.out.println("Printed by static method");
		return 0;
	}
	
	public int nonStaticMethod() {
		System.out.println("Printed by non-static method");
		return 0;
	}
}