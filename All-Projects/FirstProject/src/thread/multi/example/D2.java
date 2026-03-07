package thread.multi.example;

public class D2 extends Thread {
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.print(i + " ");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
