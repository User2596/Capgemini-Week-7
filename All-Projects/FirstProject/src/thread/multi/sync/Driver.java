package thread.multi.sync;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		D1 d1 = new D1();
        D2 d2 = new D2();

        Thread t1 = new Thread(() -> {for (int i = 0; i < 5000; i++) d1.inc();});
        Thread t2 = new Thread(() -> {for (int i = 0; i < 5000; i++) d1.inc();});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + d1.i);
        
        t1 = new Thread(() -> {for (int i = 0; i < 5000; i++) d2.inc();});
        t2 = new Thread(() -> {for (int i = 0; i < 5000; i++) d2.inc();});
        Thread t3 = new Thread(t2::start);
        t1.start();
        t3.start();
        t1.join();
        t3.join();
        System.out.println("Final count: " + d2.i);
    }
}