package thread.multi.example;

public class D1 implements Runnable {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.print((char) ('A' + i) + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
