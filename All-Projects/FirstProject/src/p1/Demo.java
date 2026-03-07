package p1;

public class Demo {
	
	public static int i;
	
	public static void main(String[] args) {
		
		
	}
	
	public static String whatIsIt(char c) {
		String rtn = null;
		System.out.println(i);
		if (c>='a' && c<='z') {
			rtn="LCA";
			return rtn;
		} else if (c>='A' && c<='Z') {
			rtn="UCA";
			return rtn;
		} else if (c>='0' && c<='9') {
			rtn="num";
			return rtn;
		} else {
			rtn="SC";
			return rtn;
		}
	}

}
