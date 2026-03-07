package String;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Kunal";
		String str2 = "Kunal";
		String str3 = new String("Kunal");
		String str4 = new String("Kunal");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		if (str1==str2) {
			System.out.println("str1 & str2 are in the same block of memory.");
		} else {
			System.out.println("str1 & str2 are not in the same block of memory.");
		}
		if (str1==str3) {
			System.out.println("str1 & str3 are in the same block of memory.");
		} else {
			System.out.println("str1 & str3 are not in the same block of memory.");
		}
		if (str3==str4) {
			System.out.println("str3 & str4 are in the same block of memory.");
		} else {
			System.out.println("str3 & str4 are not in the same block of memory.");
		}
	}

}
