package com.mpp.exam.prob3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import helperclasses.Book;
import helperclasses.LibraryMember;
import helperclasses.LibrarySystemException;
import helperclasses.TestData;

public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

		LibraryMember member = p.detectIfWinnerDuringCheckout(members);
		System.out.println(member);

	}

	Iterator<Book> books;

	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {

		return mems.stream().filter(mem -> {
			try {
				return mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
						.getCheckoutRecordEntries().size() == 10;
			} catch (LibrarySystemException e) {

				e.printStackTrace();
				return false;
			}
		}).findFirst().orElse(null);
	

	}
	
}
