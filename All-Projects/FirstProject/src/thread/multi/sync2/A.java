package thread.multi.sync2;

public class A {
	public synchronized void methodA(B b) {
		System.out.println("Thread 1 holding A");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Thread 1 waiting for B");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A last()");
	}
}