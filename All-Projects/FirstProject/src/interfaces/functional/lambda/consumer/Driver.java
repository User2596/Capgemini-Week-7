package interfaces.functional.lambda.consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>(List.of(2, 5, 1, 7, 4, 9, 6, 8, 0, 3));
		
//		Consumer<Integer> c1 = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
//		
//		Consumer<Integer> c = System.out::println;
//		l.forEach(c);
//		l.forEach(c1);
		
//		Stream<Integer> s = l.stream();
//		s.forEach(System.out::println);
//		
//		l.stream()
//			.forEach(n-> System.out.print(n+" "));
		l.stream()
			.filter(n -> n%2==1)
			.limit(3)
			.sorted(Collections.reverseOrder())
			.map(n -> n+" ")
			.forEach(System.out::print);
		
		System.out.println();
		System.out.println(l.stream().map(n -> n+"").collect(Collectors.joining(", ")));
		
		l.stream()
			.distinct()
			.collect(Collectors.toMap(
				n -> n,
				n -> n.toString().length()
			));
	}
}
