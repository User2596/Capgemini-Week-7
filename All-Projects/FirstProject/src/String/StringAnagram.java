package String;

import java.util.Arrays;

public class StringAnagram {

	static String s1 = "listen", s2 = "silent";
	
	public static void main(String[] args) {
		
		if (isAnagram(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String str1 = new String(c1);
		String str2 = new String(c2);
		return str1.equals(str2);
	}

}
