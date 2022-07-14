package prob1;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

import java.util.function.BiPredicate;

public class Problem1 {
	
	// name and type of lambda goes here
	TriPredicate<Double, Double, Double> triPredicate1 = (x, y, z) -> x * y * z < x + y;
	
	// representing lambda as a method reference
	TriPredicate<Double, Double, Double> triPredicate2 = Problem1::threeVariableEquation;
	
	
	//representing lambda as a static nested class
	static class EquationPredicate implements TriPredicate<Double, Double, Double> {
		@Override
		public boolean test(Double x, Double y, Double z) {
			return x * y * z < x + y;
		}
	}

	
	//evaluate with Double inputs 2.1, 0.35, 0.35
	public void evaluator() {
		System.out.println(triPredicate1.test(2.1, 0.35, 0.35));
		System.out.println(triPredicate2.test(2.1, 0.35, 0.35));
		System.out.println(new EquationPredicate().test(2.1, 0.35, 0.35));
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

	public static boolean threeVariableEquation(double x, double y, double z) {
		return x * y * z < x + y;
	}
	
}
