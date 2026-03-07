package String;

public class StringModif {

	public static void main(String[] args) {
		String s = "I passed my brothers";
		StringBuilder alphabet = new StringBuilder();
		for (char c = 0; c <= 255; c++) {
			if (s.indexOf(c) != s.lastIndexOf(c)) {
				alphabet.append(c);
			}
		}
		int[] arr = new int[alphabet.length()];
		
		
		StringBuilder str = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
			int pos = alphabet.toString().indexOf(s.charAt(i));
			if (pos != -1) {
				int count = ++arr[pos];
				for (int j=0; j<count; j++) {
					str.append(s.charAt(i));
				}
			}
			str.append(s.charAt(i));
		}
		System.out.println(str);
	}

}
