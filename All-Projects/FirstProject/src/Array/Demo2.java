package Array;

import java.lang.reflect.Array;

public class Demo2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			boolean[] booleanArray = {true, false, true};
			char[] charArray = {'k', 'q', 'g'};
			char[] charArray1 = {'k', 'q', 'g'};
			char[] charArray2 = charArray;
			Object[] objectArray = {1234567890L, "string", '1'};
			
//			//different types of address
//			System.out.println(booleanArray);
//			System.out.println(charArray);
//			System.out.println(charArray1);
//			System.out.println(charArray2);
//			System.out.println(objectArray);
//			System.out.println(charArray.hashCode());
//			System.out.println(charArray1.hashCode()); 	//same value but not referenced
//			System.out.println(charArray2.hashCode()); 	//referenced
			
			arrayPrinter(booleanArray, charArray, objectArray[0], objectArray);
			arrayPrinter(booleanArray);
			arrayPrinter(charArray);
			arrayPrinter(objectArray);
			
//			boolean b = true;
//			char c = 'k';
//			String str  = "qwerty";
//			
//			singleValuePrinter(b);
//			singleValuePrinter(c);
//			singleValuePrinter(str);
	}

	public static void arrayPrinter(Object... array) {
		for (Object obj : array) {
			if (obj != null && obj.getClass().isArray()) {
				System.out.print("[ ");
				for (int i = 0; i < Array.getLength(obj); i++) {
					System.out.print(Array.get(obj, i) + " ");
				}
				System.out.print("] ");
			}
			else {
				System.out.print(obj + " ");
			}
			
		}
		System.out.println();
	}
	
	public static void singleValuePrinter (Object var) {
		System.out.println(var);
	}
}
