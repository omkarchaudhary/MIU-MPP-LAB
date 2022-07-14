package prob4;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem4 {
	// IMPLEMENT - you must use the reduce operation on Streams to return the
	// elements common to all the lists
	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {

		return stream.reduce(new ArrayList<T>(), (x, y) -> {
			if (x.size() == 0) {
				x = y;
				return x;
			}
			x = (ArrayList<T>) x.stream().filter(t -> y.contains(t)).collect(Collectors.toList());

			return x;
		});
	}

	public static void testCombine() {
		ArrayList<ArrayList<String>> mainList = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("hello");
				add("there");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("goodbye");
				add("there");
			}
		};
		mainList.add(list1);
		mainList.add(list2);
		// output should be "there"
		System.out.println(combine(mainList.stream()));
	}

	public static void main(String[] args) {
		testCombine();
	}
}
