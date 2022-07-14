package prob2;

import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.util.List;


/*
 * Print to the console the list of book titles in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length ascending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * "xza" comes before "azx"
 */
public class Problem2 {

	public static void main(String[] args) {
		//use this list  Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27) 
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
				
	}
	

}
