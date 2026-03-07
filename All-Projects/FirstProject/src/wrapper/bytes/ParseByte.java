package wrapper.bytes;

public class ParseByte {
	static String[] strs = {"-1", "+1", "1", "-0", "+0", "0", "1+", "1-", "++", "--", "a", "a0", "a9", "!", "", " ", "a -+x 9yg-yg7"};
	public static void main(String[] args) {
		byte parseByte;
		for (String s : strs) {
			try {
				String str = parseByteString(s);
				parseByte = Byte.parseByte(str);
			} catch (Exception e) {
				System.out.println("Number cannot be parsed");
				continue;
			}
			System.out.println(parseByte);
		}
	}
	
	public static String parseByteString(String str) {
		if (str.length() == 0) return null;
		boolean flag = true;
		StringBuilder s = new StringBuilder();
		for (int i=0; i<str.length(); i++) {
			if ((flag && (str.charAt(i)=='+' || str.charAt(i)=='-')) || str.charAt(i)>='0' && str.charAt(i)<='9') { 
				s.append(str.charAt(i));
				flag=false;
			}
		}
		return s.toString();
	}
	
}
