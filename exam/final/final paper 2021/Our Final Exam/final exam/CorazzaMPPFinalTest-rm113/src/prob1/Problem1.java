package prob1;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	
	BiPredicate<Double, Double> p = (x,y) -> x * y < x + y;
	
	BiPredicate<Double, Double> p1 = Problem1 :: evlaDouble;
	
	
	static class MyPredicate implements BiPredicate<Double, Double>
	{

		@Override
		public boolean test(Double x, Double y) {
			// TODO Auto-generated method stub
			return x * y < x + y;
		}	
		
	}
	
	private static boolean evlaDouble(double x, double y) {
		return  x * y < x + y;
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		
		System.out.println(p.test(2.1, 0.35));
		System.out.println(p1.test(2.1, 0.35));
		System.out.print(new MyPredicate().test(2.1, 0.35));
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
