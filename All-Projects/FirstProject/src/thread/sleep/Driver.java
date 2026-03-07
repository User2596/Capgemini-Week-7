package thread.sleep;

public class Driver {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
