package prob1;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {

	// name and type of lambda goes here
	TriPredicate<Double, Double, Double> tripredicate1 = (x, y, z) -> x * y * z < x + y;

	// representing lambda as a method reference
	TriPredicate<Double, Double, Double> tripredicate2 = Problem1::check;

	// representing lambda as a static nested class
	static class CheckStatus implements TriPredicate<Double, Double, Double> {

		@Override
		public boolean test(Double x, Double y, Double z) {
			return x * y * z < x + y;
		}

	}

	// evaluate with Double inputs 2.1, 0.35

	public static boolean check(Double x, Double y, Double z) {
		return x * y * z < x + y;
	}

	public void evaluator() {
		System.out.println("Using lambda: " + tripredicate1.test(2.0, 7.0, 1.0));
		System.out.println("Using method reference: " + tripredicate2.test(2.0, 7.0, 1.0));
		System.out.println("Using static nested class : " + new CheckStatus().test(2.0, 7.0, 1.0));
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

}
