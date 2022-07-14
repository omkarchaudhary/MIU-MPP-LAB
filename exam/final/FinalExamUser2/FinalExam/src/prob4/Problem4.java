package prob4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem4 {
	//IMPLEMENT - you must use the reduce operation on Streams to return the elements common to all the lists
	// Choose the right version of the reduce method and define a binary operator such that given two ArrayList<T> 
	// returns the intersection of the two ArrayList<T>. 
	// Given list1 and list2 two ArrayList<T> their intersection can be computed as follows
	
	//(list1, list2) -> list1.stream().filter(list2::contains).collect(Collectors.toCollection(ArrayList<T>::new)

	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {
		return stream
				.reduce(new ArrayList<>(), (acc, list) -> {
					if (acc.size() == 0) {
						acc.addAll(list);
						return acc;
					}
					return acc.stream()
							.filter(list::contains)
							.collect(Collectors.toCollection(ArrayList<T>::new));
				});
	}

	public static void testCombine() {
		ArrayList<ArrayList<String>> mainList = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("hello");add("there");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("goodbye");add("there");

			}

		};

		mainList.add(list1);
		mainList.add(list2);

		//output should be "there"
		System.out.println(combine(mainList.stream()));
	}
	public static void main(String[] args) {
		testCombine();
	}
}
