package collection.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDriver {
	public static void main(String[] args) {
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		pQ.offer(4);
		System.out.println(pQ);
		pQ.offer(1);
		System.out.println(pQ);
		pQ.offer(5);
		System.out.println(pQ);
		pQ.offer(2);
		System.out.println(pQ);
		
		System.out.println(pQ.poll());
		System.out.println(pQ);
		System.out.println(pQ.poll());
		System.out.println(pQ);
		System.out.println(pQ.poll());
		System.out.println(pQ);
		System.out.println(pQ.poll());
		System.out.println(pQ);
		System.out.println(pQ.poll());
	}
}
