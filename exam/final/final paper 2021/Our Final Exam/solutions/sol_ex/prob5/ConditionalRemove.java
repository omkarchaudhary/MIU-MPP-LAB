package com.mpp.exam.prob6;

import java.util.function.Predicate;
import java.util.*;

public class ConditionalRemove {

	static class StrLengthCondition<T extends Object> implements Predicate<T> {
		public boolean test(T s) {
			return ((String) s).length() == 5;
		}

	}

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("Hello");
				add("Goodbye");
			}
		};
		
		ArrayList<Integer> list2 = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(200);
			}
		};
		
		System.out.println(conditionalRemove(list2));
	}

	public static List<?> conditionalRemove(ArrayList<?> list) {
		return conditionalRemoveHelper(list);

	}

	public static <T> List<T> conditionalRemoveHelper(List<T> items) {
		StrLengthCondition<T> cond = new StrLengthCondition<T>();
		for (T s : items) {
			if (cond.test(s)) {
				items.remove(s);
			}
		}
		return items;
	}
}
