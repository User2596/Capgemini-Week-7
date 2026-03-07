package thread.multi.sync2;

public class B {
	public synchronized void methodB(A a) {
		System.out.println("Thread 2 holding B");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Thread 2 waiting for A");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B last()");
	}
}
