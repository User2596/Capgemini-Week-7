package thread.multi.sync2;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(() -> a.methodA(b));
		Thread t2 = new Thread(() -> b.methodB(a));
		
		t1.start();
		t2.start();
	}
}
