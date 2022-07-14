package com.mpp.exam.prob2;

import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Print to the console the list of book Title � in sorted order -- 
 * in which the book has been checked out on June 27, 2015. 
 * The ordering of the book title is as follows: First sort by the length 
 * of the title (number of characters), then by alphabetical order.  
 */
public class Problem2 {

	public static void main(String[] args) {
		
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		List<String> lists = list.
				stream().
				filter(entry -> checkDate(entry)).
				map(a -> a.getCopy().getBook().getTitle())
				.sorted(new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {

						int i = o1.length() - o2.length();
						if (i != 0)
							return i;

						i = o1.compareTo(o2);
						if (i != 0)
							return i;

						return -1;
					}

				}).collect(Collectors.toList());

		System.out.println(lists);

	}

	private static boolean checkDate(CheckoutRecordEntry entry) {

		LocalDate inputDate = entry.getCheckoutDate();
		LocalDate checkOutDate = LocalDate.of(2015, 6, 27);

		System.out.println(inputDate);
		System.out.println(checkOutDate);

		return inputDate.equals(checkOutDate);

	}

}
