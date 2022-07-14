package prob2;

import helperclasses.Book;
import helperclasses.BookCopy;
import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;


/*
 * Print to the console the list of book titles in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length ascending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * "xza" comes before "azx"
 */
public class Problem2 {

	public static final Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
	public static final Comparator<String> reverseCharacterComparator = (a, b) -> {
		String reversedA = new StringBuilder(a).reverse().toString();
		String reversedB = new StringBuilder(b).reverse().toString();
		return reversedA.compareTo(reversedB);
	};

	public static void main(String[] args) {
		//use this list  Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27)


		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		list.stream()
				.filter(entry -> entry.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(CheckoutRecordEntry::getCopy)
				.map(BookCopy::getBook)
				.map(Book::getTitle)
				.distinct()
				.sorted(lengthComparator.thenComparing(reverseCharacterComparator))
				.forEach(System.out::println);
	}
}
