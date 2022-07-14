package prob5;

import java.util.*;

public class AllPairs {
	public static List<Pair<Integer, Integer>> allIncreasingPairs(List<Integer> list) {
		List<Pair<Integer, Integer>> returnVal = new ArrayList<>();
		for (int x : list) {
			for (int y : list) {
				if (x < y) {
					Pair<Integer, Integer> p = new Pair<>(x, y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}

	public static <T extends Comparable<? super T>> List<Pair<T, T>> allIncreasingPairs2(List<T> list) {
		List<Pair<T, T>> returnVal = new ArrayList<>();
		for (T x : list) {
			for (T y : list) {
				if (x.compareTo(y) < 0) {
					Pair<T, T> p = new Pair<>(x, y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}

	// should work for string, Employees, LocalDates
}
