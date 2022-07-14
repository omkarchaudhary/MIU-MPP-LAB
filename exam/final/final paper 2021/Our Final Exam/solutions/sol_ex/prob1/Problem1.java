package com.mpp.exam.prob1;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	BiPredicate<Double, Double> biPredicate = (Double x, Double y) -> x * y < x + y;

	// representing lambda as a method refrence
	BiPredicate<Double, Double> biPredicate2 = Problem1::evaluateDoubles;

	// representing lambda as a static nested class
	static class BiPred implements BiPredicate<Double, Double> {

		@Override
		public boolean test(Double x, Double y) {
			// TODO Auto-generated method stub
			return x * y < x + y;
		}
	}

	private static boolean evaluateDoubles(double x, double y) {
		return x * y < x + y;
	}

	// evaluate with Double inputs 2.1, 0.35
	public void evaluator() {

		System.out.println(biPredicate.test(2.1, 0.35));
		System.out.println(biPredicate2.test(2.1, 0.35));
		System.out.println((new BiPred()).test(2.1, 0.35));

		System.out.println(biPredicate.test(2.0, 2.0));
		System.out.println(biPredicate2.test(2.0, 2.0));
		System.out.println((new BiPred()).test(2.0, 2.0));

	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

}
