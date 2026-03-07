package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDriver {
	public static void main(String[] args) {
		Deque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(4);
		System.out.println(adq);
		adq.offerLast(1);
		System.out.println(adq);
		adq.offerFirst(5);
		System.out.println(adq);
		adq.offer(2);
		System.out.println(adq);
		adq.offer(null);
		System.out.println(adq);
		
		System.out.println(adq.poll());
		System.out.println(adq);
		System.out.println(adq.pollLast());
		System.out.println(adq);
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		System.out.println(adq.poll());
		System.out.println(adq);
		System.out.println(adq.poll());
	}
}
