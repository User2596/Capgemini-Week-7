package com.jUnit.tdd;

public class JUnit {
	
	public String rev(String s) {
		if (s==null) return s;
		String result = "";
		int i = s.length();
		while(i>0) result += s.charAt(--i);
		return result;
	}
}
