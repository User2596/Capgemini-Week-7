package interfaces.functional.lambda.methodRef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = n -> Math.sqrt(n);
		Function<Integer, Double> f2 = Math::sqrt;
		Function<Integer, Double> f3 = Function::incr;
		Function<Integer, Double> f4 = new Driver()::decr;
		Function<Integer, Double> f5 = f3::square;
		Function<ArrayList<Integer>, HashSet<Integer>> f6 = n -> new HashSet<>(n);
		Function<List<Integer>, Set<Integer>> f7 = HashSet::new;
		
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(9));
//		System.out.println(f2.apply(null));
		System.out.println(f3.apply(5));
		System.out.println(f4.apply(8));
		System.out.println(f5.apply(347));
		System.out.println(f6.apply(new ArrayList<>(List.of(6, 3, 4))));
		System.out.println(f7.apply(List.of(6, 16, 4)));
	}

	public double decr(int val) {
		return --val;
	}

}
