package wrapper.bytes;

public class Demo {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		byte b = 7;
		System.out.println("b: " + b);
		
		Byte b1 = b;
		System.out.println("b1: " + b1); 	// Wrapping/Auto-boxing
		
		byte b2 = b1;
		System.out.println("b2: " + b2); 	// Unwrapping/Auto-unboxing
		
		String bStr = "83";
		System.out.println("Type of bStr: " + bStr.getClass());
		Byte b3 = new Byte(bStr);
		System.out.println("b3: " + b3);
		System.out.println("Type of b3: " + b3.getClass());
		
		b3 = new Byte(b);
		System.out.println("b3: " + b3);
		
	}
}
