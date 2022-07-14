package prob1;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {
	
	// name and type of lambda goes here
	TriFunction<Double, Double, Double, Boolean> tf = ( x, y,z) -> x * y * z < x + y;
	
	// representing lambda as a method reference
	TriFunction<Double, Double, Double, Boolean> tf2 =  Problem1::helper;
	
	static boolean helper(){
		( x, y,z) -> x * y * z < x + y;
		}
	
	
	//representing lambda as a static nested class
	class NestClassLamda implement TriFunction{
		@override
		Boolean apply(Double x,Double y,Double z){
			return x * y * z < x + y;
		}
		
	}
	
	
	//evaluate with Double inputs 2.1, 0.35, 0.35
	public void evaluator() {
		System.out.prinln("1"+tf.apply(2.1,0.35,0.35));
		System.out.prinln("2"+tf2.apply(2.1,0.35,0.35));
		System.out.prinln("3"+new NestClassLamda().apply(2.1,0.35,0.35));
		
		
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
