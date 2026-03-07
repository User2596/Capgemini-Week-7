package thread.multi.sync;

public class D2 extends Thread {
	public int i = 0;
	
	public synchronized void inc() {
		i++;
	}
}
