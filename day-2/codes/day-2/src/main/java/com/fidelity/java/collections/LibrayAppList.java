package com.fidelity.java.collections;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrayAppList {
	static Scanner sc = new Scanner(System.in);;

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();

		while (true) {
			System.out.println("1. Add New Book");
			System.out.println("2. List All Books");
			System.out.println("3. Exit");
			System.out.println();

			System.out.print("what can I do for you? ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				Book bk = generateBook();
				boolean existing = checkIsBookExists(books, bk);
				if (existing) {
					System.err.println("Book already exists");
				} else {
					books.add(bk);
					System.out.println("Book added to library!!");
				}
				break;
			case 2:
				printBooks(books);
				break;
			}// switch
			System.out.println("=".repeat(100));
		} // while

	}

	private static boolean checkIsBookExists(List<Book> books, Book bk) {
		for (Book book : books) {
			if (book.getBookId().equals(bk.getBookId())) {
				return true;
			}
		}
		return false;
	}

	private static void printBooks(List<Book> books) {
		for (Book bk : books) {
			System.out.println(bk);
		}
	}

	private static Book generateBook() {
		System.out.print("enter book id: ");
		long bid = sc.nextLong();
		sc.nextLine();

		System.out.print("enter book title: ");
		String title = sc.nextLine();

		System.out.print("enter author name: ");
		String author = sc.nextLine();

		return new Book(bid, title, author);
	}

}
