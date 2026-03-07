package Array;

public class Demo {

	public static void main(String[] args) {
		System.out.println("start");
		Object[] arr = new Object[5];
		arr[0] = true;
		arr[1] = (byte) 1;
		arr[2] = 'k';
		arr[3] = "someString";
		arr[4] = 1234567890L;
		
		try {
			arr[5] = 1/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Object i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("end");
	}

}
