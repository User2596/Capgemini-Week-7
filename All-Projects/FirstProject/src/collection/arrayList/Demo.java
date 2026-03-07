package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> aL= new ArrayList<>();
		aL.add(1);
		aL.add(2);
		aL.add(3);
		aL.add(4);
		System.out.println(aL);
		aL.add(5);
		System.out.println(aL);
		aL.add(3, 9);
		System.out.println(aL);
		System.out.println(aL.size());
//		aL.add(-1, 9);
//		System.out.println(aL);
		aL.add(6, 9);
		System.out.println(aL);
		System.out.println(aL.size());
//		aL.add(8, 9);
//		System.out.println(aL);
		Iterator<Integer> iterator = aL.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		for (int i=0; i<aL.size(); i++) {
			System.out.print(aL.get(i) + " ");
		}
	}
}
