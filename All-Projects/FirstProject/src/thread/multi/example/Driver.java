package thread.multi.example;

public class Driver extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread d1 = new Thread(new D1());
		D2 d2 = new D2();
		
//		d1.run();
//		d2.run();
		d1.start();
		d2.run();
		System.out.println("Yesssss!");
		d1.join();
		System.out.println("Noooooo!");
	}
}
